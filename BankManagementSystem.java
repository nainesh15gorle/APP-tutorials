class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited " + amount + ". Balance: " + balance);
        }
    }
    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount + ". Balance: " + balance);
            return true; // success
        } else {
            System.out.println("Not enough balance!");
            return false; // failed
        }
    }
    void transfer(BankAccount toAccount, double amount) {
        if (withdraw(amount)) {   // only withdraw if possible
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + accountHolder + " to " + toAccount.accountHolder);
        } else {
            System.out.println("Transfer failed!");
        }
    }
    void showAccount() {
        System.out.println(accountNumber + " | " + accountHolder + " | Balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("101", "Alice", 5000);
        BankAccount acc2 = new BankAccount("102", "Bob", 3000);
        acc1.showAccount();
        acc2.showAccount();
        acc1.deposit(1000);
        acc2.withdraw(500);
        acc1.transfer(acc2, 2000);
        acc1.showAccount();
        acc2.showAccount();
    }
}