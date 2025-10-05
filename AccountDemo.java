abstract class Account {
    protected double balance;

    public Account(double balance) { this.balance = balance; }
    public abstract double calculateInterest();
}

class SavingsAccount extends Account {
    private static final double RATE = 0.04;
    public SavingsAccount(double balance) { super(balance); }
    @Override public double calculateInterest() { return balance * RATE; }
}

class CurrentAccount extends Account {
    private static final double RATE = 0.02;
    public CurrentAccount(double balance) { super(balance); }
    @Override public double calculateInterest() { return balance * RATE; }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000);
        Account current = new CurrentAccount(1000);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());
    }
}