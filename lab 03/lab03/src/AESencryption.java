import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class AESencryption implements IEncryption {
    private final SecretKey key;
    public AESencryption (String keyText){
        byte[] aesKey = Base64.getDecoder().decode(keyText);
         key = new SecretKeySpec(aesKey, "AES");
    }


    public String encrypt(String text) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.getIV();
            byte[] cipherText = cipher.doFinal(text.getBytes());
            return Base64.getEncoder().encodeToString(encrypted) ;
        } catch (Exception e) {
            throw new RuntimeException("Error in encryption", e);
        }
    }


    public String decrypt(String cipherText){
        try{
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] decrupted = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return new String(decrupted);
        }
        catch(Exception e){
            throw new RuntimeException("Error in decryption", e);
        }
    }

}
