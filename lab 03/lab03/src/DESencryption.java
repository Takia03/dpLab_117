import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class DESencryption implements IEncryption {

    private final SecretKey key;

    public DESencryption(String keyText){
        byte[] desKey = Base64.getDecoder().decode(keyText);
        key = new SecretKeySpec(desKey, "DES");
    }



    public String encrypt(String text) {
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
           byte[] encrypted = cipher.doFinal(text.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            throw new RuntimeException("Error in encryption", e);
        }
    }


    public String decrypt(String cipherText){
        try{
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return new String(decrypted);
        }
        catch(Exception e){
            throw new RuntimeException("Error in decryption", e);
        }
    }

}
