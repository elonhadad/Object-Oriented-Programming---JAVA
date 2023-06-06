public class Screen {
    public Screen(){
    }
    public void displayGreeting(){
        System.out.println("Welcome!");
    }
    public void displayAccpromt(){
        System.out.println("Please enter your account number:");
    }
    public void displayPwPromt(){
        System.out.println("Enter your PIN:");
    }
    public void displayMainMenu(){
        System.out.println("Main menu");
        System.out.println("\t1 - View my balance");
        System.out.println("\t2 - Withdraw cash");
        System.out.println("\t3 - Deposit funds");
        System.out.println("\t4 - Exit");
    }
    public void displayEnter(){
        System.out.println("Enter a choice:");
    }
    public void displayBalance(float balance){
        System.out.println("Your balance is: " + balance);
    }
    public void displayHowMuch(){
        System.out.println("Withdrawl menu");
        System.out.println("\t1 - $20\t\t4 - $100");
        System.out.println("\t2 - $40\t\t5 - $200");
        System.out.println("\t3 - $60\t\t6 - Cancel transaction");
        System.out.print("Choose a withdrawl amount:\n");
    }
    public void displayWithdrew() {
        System.out.print("Withdrew ");
    }
    public void displayDepositMenu() {
        System.out.println("How much would you like to deposit?");
    }
    public void displayDeposit(float gc) {
        System.out.println("Deposit "+ gc);
    }
    public void displayEnd() {
        System.out.println("Good bye!");
    }
}
