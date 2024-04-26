import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;
/**
 * Utility class for RSA encryption, decryption, and digital signatures
 */
class RSAUtil {
    private static final String RSA_CIPHER = "RSA/ECB/PKCS1Padding";
    private static final int RSA_KEY_SIZE = 2048; // Key size for RSA-2048

    /**
     * Generates an RSA key pair.
     * @return KeyPair RSA public and private key pair
     * @throws Exception
     */
    public static KeyPair generateRSAKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(RSA_KEY_SIZE);
        return keyPairGenerator.generateKeyPair();
    }

    /**
     * Encrypts plaintext using RSA.
     * @param plaintext Text to be encrypted
     * @param key RSA public key
     * @return String Base64 encoded ciphertext
     * @throws Exception
     */
    public static String encrypt(String plaintext, PublicKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_CIPHER);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     * Decrypts ciphertext using RSA.
     * @param ciphertext Base64 encoded ciphertext to be decrypted
     * @param key RSA private key
     * @return String Decrypted plaintext
     * @throws Exception
     */
    public static String decrypt(String ciphertext, PrivateKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_CIPHER);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
        return new String(decrypted);
    }

    /**
     * Signs data using RSA private key.
     * @param data Data to be signed
     * @param privateKey RSA private key
     * @return String Base64 encoded signature
     * @throws Exception
     */
    public static String signData(String data, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(data.getBytes());
        return Base64.getEncoder().encodeToString(signature.sign());
    }

    /**
     * Verifies a signature against the data using RSA public key.
     * @param data Data that was signed
     * @param signatureStr Base64 encoded signature
     * @param publicKey RSA public key
     * @return boolean True if the signature is valid, false otherwise
     * @throws Exception
     */
    public static boolean verifySignature(String data, String signatureStr, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);
        signature.update(data.getBytes());
        return signature.verify(Base64.getDecoder().decode(signatureStr));
    }
}
