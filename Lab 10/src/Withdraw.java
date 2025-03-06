public class Withdraw implements Command{

    private BankAccount account ;
    private double amount;

    public Withdraw(BankAccount account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public void execute(){
        account.withdraw(amount);
        System.out.println("Withdraw successful !");
    }
}
