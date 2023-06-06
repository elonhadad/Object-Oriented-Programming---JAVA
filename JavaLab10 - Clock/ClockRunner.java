package threads;

public class ClockRunner extends Thread {
    Clock clock;

    public ClockRunner() {
        clock = new Clock( 600 );
    }

    public void run() {
        while(true)
            clock.setTime(System.currentTimeMillis());

    }

    static public void main( String[] s ) throws InterruptedException {
        ClockRunner cr = new ClockRunner();
        cr.start();
        cr.join();
    }
}