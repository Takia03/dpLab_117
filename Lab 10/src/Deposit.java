public class Deposit implements Command{
    private BankAccount account;
    private double amount;

    public Deposit(BankAccount account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public void  execute(){
        account.deposite(amount);
        System.out.println("Deposite successful !");
    }
}
