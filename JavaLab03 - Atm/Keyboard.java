import java.util.Scanner;

public class Keyboard {
    private Scanner s;

    public Keyboard(){
        s = new Scanner(System.in);
    }
    public int getAcct(){
        int ga = s.nextInt();
        return ga;
    }
    public String getPassword(){
        String pw = s.next();
        return pw;
    }
    public int getChoice(){
        int gc = s.nextInt();
        return gc;
    }
    public float getAmount(){
        float gam = s.nextFloat();
        return gam;
    }


}
