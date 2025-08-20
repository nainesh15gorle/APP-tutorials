import java.util.ArrayList;
import java.util.List;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double calculateTotalBalance() {
        double total = 0.0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}

public class BankingOOP {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new Account(1000.50));
        bank.addAccount(new Account(2500.75));
        bank.addAccount(new Account(500.25));
        bank.addAccount(new Account(3000.00));
        bank.addAccount(new Account(1500.35));

        System.out.printf("Total balance (OOP): $%.2f%n", bank.calculateTotalBalance());
    }
}