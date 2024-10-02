import java.nio.file.Files;
import java.nio.file.Paths;

public class EncryptionText {
    private IEncryption encryption;

    public void setEncryption(IEncryption encryption) {
        this.encryption = encryption;
    }

    // Method to encrypt a file
    public void encryptFile(String inputFile, String outputFile) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            String encryptedContent = encryption.encrypt(content);
            Files.write(Paths.get(outputFile), encryptedContent.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error in file encryption", e);
        }
    }

    // Method to decrypt a file
    public void decryptFile(String inputFile, String outputFile) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            String decryptedContent = encryption.decrypt(content);
            Files.write(Paths.get(outputFile), decryptedContent.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("Error in file decryption", e);
        }
    }
}
