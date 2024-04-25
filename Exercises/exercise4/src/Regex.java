import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Demonstrates the use of regular expressions to validate various string formats.
 */
public class Regex {
    public static void main(String[] args) {

        // Pattern for validating US phone numbers
        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        checkPattern(phonePattern, "123-456-7890", true);
        checkPattern(phonePattern, "1234567890", false);

        // Pattern for validating email addresses
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        checkPattern(emailPattern, "user@example.com", true);
        checkPattern(emailPattern, "user-email.com", false);

        // Pattern for validating usernames (must start with a letter and be 6 to 20 characters long)
        String usernamePattern = "^[A-Za-z][A-Za-z0-9_-]{5,19}$";
        checkPattern(usernamePattern, "user_123", true);
        checkPattern(usernamePattern, "123user", false);

        // Pattern for validating US postal codes
        String postalCodePattern = "^\\d{5}$";
        checkPattern(postalCodePattern, "12345", true);
        checkPattern(postalCodePattern, "123456", false);

        // Pattern for validating IPv4 addresses
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        checkPattern(ipPattern, "100.200.89.90", true);
        checkPattern(ipPattern, "260.200.89.90", false);

    }

    /**
     * Validates if the subject string matches the provided pattern and compares it against the expected validity.
     * @param pattern The regex pattern to validate against.
     * @param subject The string to test.
     * @param isValid Expected validity: true if the string should match the pattern, false otherwise.
     */
    private static void checkPattern(String pattern, String subject, boolean isValid) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(subject);
        boolean matches = matcher.matches();

        System.out.println("Testing pattern: " + pattern);
        System.out.println("Subject: " + subject);
        if (matches == isValid) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}


