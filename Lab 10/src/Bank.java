import java.util.List;
import java.util.ArrayList;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void createAccount(String accountNumber, double initialBalance){
        if(getAccount(accountNumber)!=null) {
            System.out.println("Account atready exits");
        } else{
            accounts.add(new BankAccount(accountNumber, initialBalance));
            System.out.println("Account" + accountNumber + "created with balance" + initialBalance);
        }
    }

    public BankAccount getAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
