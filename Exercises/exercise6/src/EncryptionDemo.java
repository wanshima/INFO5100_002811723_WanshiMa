import java.security.*;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/**
 * Main class to demonstrate encryption and decryption
 */
public class EncryptionDemo {
    public static void main(String[] args) throws Exception {
        // Initialize keys for Alice and Bob
        KeyPair aliceKeyPair = RSAUtil.generateRSAKeyPair();
        KeyPair bobKeyPair = RSAUtil.generateRSAKeyPair();
        SecretKey aesKey = AESUtil.generateAESKey();

        // Create sample message
        String originalMessage = "Hello, Bob!";
        System.out.println("Original Message: " + originalMessage);

        // Symmetric encryption and decryption
        byte[] iv = new byte[12]; // NEVER reuse this IV with the same key
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        GCMParameterSpec ivSpec = AESUtil.createIVSpec(iv); // Use AESUtil to create IV spec

        String encryptedMessageAES = AESUtil.encrypt(originalMessage, aesKey, ivSpec);
        System.out.println("Encrypted with AES: " + encryptedMessageAES);

        String decryptedMessageAES = AESUtil.decrypt(encryptedMessageAES, aesKey, ivSpec);
        System.out.println("Decrypted Message (AES): " + decryptedMessageAES);

        // Asymmetric encryption and decryption
        String encryptedMessageRSA = RSAUtil.encrypt(originalMessage, bobKeyPair.getPublic());
        System.out.println("Encrypted with RSA: " + encryptedMessageRSA);

        String decryptedMessageRSA = RSAUtil.decrypt(encryptedMessageRSA, bobKeyPair.getPrivate());
        System.out.println("Decrypted Message (RSA): " + decryptedMessageRSA);

        // RSA Signing and verification
        String signature = RSAUtil.signData(originalMessage, aliceKeyPair.getPrivate());
        System.out.println("Signature: " + signature);

        boolean isVerified = RSAUtil.verifySignature(originalMessage, signature, aliceKeyPair.getPublic());
        System.out.println("Signature verified: " + isVerified);
    }
}
