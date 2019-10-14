package bankaccount;

public class BankCustomer {
    private String ID;
    private double balance;

    public BankCustomer(String ID, double balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public BankCustomer() {
        this.ID = "AA12345";
        this.balance = 0.0;
    }
    public String getId(){
        return ID;
    }
    public double getBalance(){
        return balance;
    }
}
