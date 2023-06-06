public class Db {
    private String dbName;
    private float balance;

    public Db(String dbName){
        this.dbName = dbName;
        this.balance = 0;
    }
    public boolean verify(int acct, String pw){
        return true;
    }
    public void withdraw (float amount){
        balance -= amount;
    }
    public void deposit(float amount){
        balance += amount;
    }
    public float getBalance(){
        return this.balance;
    }
}
