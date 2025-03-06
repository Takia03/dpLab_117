import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankRepository bankRepo = new BankRepository();
        EventBus eventBus = new EventBus();
        Scanner scanner = new Scanner(System.in);

        eventBus.subscribe(event -> System.out.println("Event: " + event.getType() + " - " + event.getDetails()));

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                String accNum = scanner.next();
                bankRepo.save(new BankAccount(accNum, 0));
                System.out.println("Account created!");

            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                String accNum = scanner.next();
                BankAccount account = bankRepo.get(accNum);
                if (account != null) {
                    new DepositCommand(account, scanner.nextDouble(), eventBus).execute();
                }

            } else if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}
