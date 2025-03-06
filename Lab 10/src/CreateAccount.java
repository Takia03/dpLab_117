public class CreateAccount implements Command{
    private Bank bank;
    private String accountNumber;
    private double initialBalance;

    public CreateAccount(Bank bank, String accountNumber, double initialBalance){
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public void execute(){
         bank.createAccount(accountNumber,initialBalance);
    }
}
