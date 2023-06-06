public class Atm {
    private Screen scr;
    private Keyboard kbd;
    private Db db;

    public Atm(String dbName){
        scr = new Screen();
        kbd = new Keyboard();
        db = new Db(dbName);
    }
    public void go(){
        int gc = 0;
        int ga = 0;
        String pw = "";
        float amo = 0;

        scr.displayGreeting();
        scr.displayAccpromt();
        ga = kbd.getAcct();
        scr.displayPwPromt();
        pw = kbd.getPassword();

        while(true) {
            scr.displayMainMenu();
            scr.displayEnter();
            gc = kbd.getChoice();

            if (gc == 4) {
                scr.displayEnd();
                break;
            }
            if (gc == 1) {
                scr.displayBalance(db.getBalance());
            }
            if (gc == 2) {
                scr.displayHowMuch();
                gc = kbd.getChoice();
                scr.displayWithdrew();

                if (gc == 1) {
                    System.out.println(20.0f);
                    db.withdraw(20);
                }
                if (gc == 2) {
                    System.out.println(40.0f);
                    db.withdraw(40);
                }
                if (gc == 3) {
                    System.out.println(60.0f);
                    db.withdraw(60);
                }
                if (gc == 4) {
                    System.out.println(100.0f);
                    db.withdraw(100);
                }
                if (gc == 5) {
                    System.out.println(200.0f);
                    db.withdraw(200);
                }
                if (gc == 6) {
                    break;
                }
            }
            if (gc == 3) {
                scr.displayDepositMenu();
                gc = kbd.getChoice();
                scr.displayDeposit(gc);
                db.deposit(gc);

            }
        }
    }
}
