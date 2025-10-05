public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // Create accounts
        BankAccount acc1 = new BankAccount("1001", "John Doe", 1000);
        BankAccount acc2 = new BankAccount("1002", "Jane Smith", 500);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        
        // Perform transactions
        System.out.println("=== BANK MANAGEMENT SYSTEM ===");
        System.out.println("Initial balances:");
        System.out.println("John: $" + acc1.getBalance());
        System.out.println("Jane: $" + acc2.getBalance());
        
        acc1.deposit(200);
        System.out.println("\nAfter depositing $200 to John: $" + acc1.getBalance());
        
        boolean withdrawSuccess = acc1.withdraw(300);
        System.out.println("Withdraw $300 from John: " + (withdrawSuccess ? "Success" : "Failed"));
        System.out.println("John's balance: $" + acc1.getBalance());
        
        boolean transferSuccess = acc1.transfer(acc2, 400);
        System.out.println("Transfer $400 from John to Jane: " + (transferSuccess ? "Success" : "Failed"));
        System.out.println("John: $" + acc1.getBalance());
        System.out.println("Jane: $" + acc2.getBalance());
        
        // Try to overdraw
        boolean overdraw = acc1.withdraw(1000);
        System.out.println("Try to withdraw $1000 from John: " + (overdraw ? "Success" : "Failed - Insufficient funds"));
    }
}