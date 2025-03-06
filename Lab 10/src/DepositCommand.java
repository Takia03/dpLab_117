class DepositCommand implements Command {
    private BankAccount account;
    private double amount;
    private EventBus eventBus; // ✅ Add event system

    public DepositCommand(BankAccount account, double amount, EventBus eventBus) { // ✅ Fixed
        this.account = account;
        this.amount = amount;
        this.eventBus = eventBus;
    }

    @Override
    public void execute() {
        account.deposit(amount, eventBus); // ✅ Pass EventBus to trigger event
    }
}
