package threads;

public class Lab10Test {

    public static void main(String[] args) throws InterruptedException {
        ClockRunner cr = new ClockRunner();
        FileCopier  fc = new FileCopier( "many_words.txt" );

        cr.start();
        fc.start();
        fc.join();
    }
}
