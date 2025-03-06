import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Transaction History\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Enter Account Number");
                String accountNumber = scanner.next();
                System.out.println("Enter Initial Balance");
                double initialBalance = scanner.nextDouble();
                CreateAccount createAccount= new CreateAccount(bank, accountNumber, initialBalance);
                System.out.println("Account created successfully !");

            } else if (choice == 2){
                System.out.println("Enter Account Number");
                String accountNumber = scanner.next();
                System.out.println("Enter Amount to Deposit");
                double amount = scanner.nextDouble();
                Deposit deposit = new Deposit(bank.getAccount(accountNumber), amount);
                System.out.println("Deposit successful !");

            } else if (choice == 3){
                System.out.println("Enter Account Number");
                String accountNumber = scanner.next();
                System.out.println("Enter Amount to Withdraw");
                double amount = scanner.nextDouble();
                Withdraw withdraw = new Withdraw(bank.getAccount(accountNumber), amount);
                System.out.println("Withdraw successful !");
            } else if (choice == 4) {
                System.out.println("Enter Account Number");
                String accountNumber = scanner.next();
                System.out.println("Balance: " + bank.getAccount(accountNumber).getBalance());
            } else if (choice == 5) {
                System.out.println("Enter Account Number");
                String accountNumber = scanner.next();
                System.out.println("Transaction History: " + bank.getAccount(accountNumber).getTransactionHistory());
            } else if (choice == 6) {
                break;

            }
        }
    }
}