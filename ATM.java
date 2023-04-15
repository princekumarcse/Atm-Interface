package atmmachine;

public class ATM {

    private double balance;
    private double depositeAmount;
    private double withrawAmount;

    public ATM() {

    }

    //setter getter method
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double setDepositeAmount(double depositeAmount) {
        return depositeAmount;
    }

    public double getwithrawAmount() {
        return withrawAmount;
    }

    public void setwithrawAmount(double withrawAmount) {
        this.withrawAmount = withrawAmount;
    }

}
