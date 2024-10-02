import java.util.Base64;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to encrypt: ");
        System.out.println("Enter the key: ");
        System.out.println("Enter the encryption type (1. AES/ 2.DES): ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        EncryptionText encryptionText = new EncryptionText();
        if(choice == 1){
            System.out.print("Enter AES key (Base64): ");
            String aesKeyInput = scanner.nextLine();
            encryptionText.setEncryption(new AESencryption(aesKeyInput));
        } else if (choice == 2) {
            System.out.print("Enter DES key (Base64): ");
            String desKeyInput = scanner.nextLine();
            encryptionText.setEncryption(new DESencryption(desKeyInput));
        } else {
            throw new RuntimeException("Invalid choice");
        }

        System.out.println("Enter the input file path: ");
        String inputFile = scanner.nextLine();
        System.out.println("Enter the output file path: ");
        String outputFile = scanner.nextLine();

        encryptionText.encryptFile(inputFile, outputFile);
        System.out.println("File encrypted successfully");

        System.out.println("Enter the output file path: ");
        inputFile = scanner.nextLine();

        encryptionText.decryptFile(inputFile, outputFile);
        System.out.println("File decrypted successfully"+outputFile);

    }
}