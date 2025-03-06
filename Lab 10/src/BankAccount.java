import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: $" + initialBalance);
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public List<String> getTransactionHistory() { return transactionHistory; }

    public void deposit(double amount, EventBus eventBus) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
        eventBus.publish(new Event("Deposit", "Account " + accountNumber + " deposited $" + amount));
    }

    public void withdraw(double amount, EventBus eventBus) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrew: $" + amount);
        eventBus.publish(new Event("Withdraw", "Account " + accountNumber + " withdrew $" + amount));
    }
}
