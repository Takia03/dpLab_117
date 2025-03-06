public class Deposit implements Command{
    private BankAccount account;
    private double amount;
    private EventBus eventBus;

    public Deposit(BankAccount account, double amount){
        this.account = account;
        this.amount = amount;
        this.eventBus = new EventBus();
    }

    public void  execute(){
        account.deposite(amount, eventBus);
        System.out.println("Deposite successful !");
    }
}
