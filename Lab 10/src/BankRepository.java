import java.util.ArrayList;
import java.util.List;

class BankRepository {
    private List<BankAccount> accounts = new ArrayList<>();

    public void save(BankAccount account) {
        if (get(account.getAccountNumber()) == null) {
            accounts.add(account);
        }
    }

    public BankAccount get(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
