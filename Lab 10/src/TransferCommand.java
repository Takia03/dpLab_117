class TransferCommand implements Command {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;
    private EventBus eventBus;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount, EventBus eventBus) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.eventBus = eventBus;
    }

    @Override
    public void execute() {
        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient funds for transfer!");
            return;
        }
        fromAccount.withdraw(amount, eventBus);
        toAccount.deposit(amount, eventBus);
        eventBus.publish(new Event("Transfer", "Transferred $" + amount + " from " + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber()));
    }
}
