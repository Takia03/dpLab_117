import java.util.*;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposite(double amount){
        balance += amount;
        transactionHistory.add("Deposite:" + amount);
    }

    public void withdraw(double amount){
    if(balance >= amount){
        balance -= amount;
        transactionHistory.add("Withdraw:" + amount);
       }else {
        System.out.println("Insufficient balance");
       }
     }

     public double getBalance(){
        return balance;
     }


     public List<String> getTransactionHistory(){
        return transactionHistory;
     }

     public String getAccountNumber(){
        return accountNumber;
     }

}



