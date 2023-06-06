package threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCopier extends Thread {
    String fileName;

    public FileCopier(String fn) {
        fileName = fn;
    }

    public void copy(String fn)
    {
        while(true) {
            try {
                FileReader fr = new FileReader(new File(fn) );
                int c = fr.read();
                while( c != -1 ){
                    System.out.print((char)c);
                    c = fr.read();
                }
                fr.close();
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        copy(fileName);
    }

    public static void main(String[] args) throws InterruptedException {
        FileCopier fc = new FileCopier(args[0]);
        fc.start();
        fc.join();
    }
}
