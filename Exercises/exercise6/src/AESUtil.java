import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

/**
 * Utility class for AES encryption and decryption operations.
 */
class AESUtil {
    private static final String AES_CIPHER = "AES/GCM/NoPadding";
    private static final int AES_KEY_SIZE = 256; // AES-256
    private static final int GCM_TAG_LENGTH = 128; // bits

    /**
     * Generates an AES key.
     * @return SecretKey AES key
     * @throws Exception
     */
    public static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(AES_KEY_SIZE);
        return keyGenerator.generateKey();
    }

    /**
     * Encrypts plaintext using AES encryption.
     * @param plaintext The text to encrypt.
     * @param key AES SecretKey.
     * @param ivSpec Initialization vector specification for AES.
     * @return String Base64 encoded ciphertext.
     * @throws Exception
     */
    public static String encrypt(String plaintext, SecretKey key, GCMParameterSpec ivSpec) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CIPHER);
        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     * Decrypts ciphertext using AES encryption.
     * @param ciphertext Base64 encoded ciphertext.
     * @param key AES SecretKey.
     * @param ivSpec Initialization vector specification for AES.
     * @return String Decrypted plaintext.
     * @throws Exception
     */
    public static String decrypt(String ciphertext, SecretKey key, GCMParameterSpec ivSpec) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CIPHER);
        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
        return new String(decrypted);
    }

    public static GCMParameterSpec createIVSpec(byte[] iv) {
        return new GCMParameterSpec(GCM_TAG_LENGTH, iv);
    }
}