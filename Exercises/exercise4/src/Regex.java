import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {

        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        checkPattern(phonePattern, "123-456-7890", true);
        checkPattern(phonePattern, "1234567890", false);

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        checkPattern(emailPattern, "user@example.com", true);
        checkPattern(emailPattern, "invalid-email.com", false);

        String usernamePattern = "^[A-Za-z][A-Za-z0-9_-]{5,19}$";
        checkPattern(usernamePattern, "user_123", true);
        checkPattern(usernamePattern, "9user123", false);

        String postalCodePattern = "^\\d{5}$";
        checkPattern(postalCodePattern, "12345", true);
        checkPattern(postalCodePattern, "123456", false);

        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        checkPattern(ipPattern, "192.168.1.1", true);
        checkPattern(ipPattern, "256.100.50.25", false);

    }

    private static void checkPattern(String pattern, String subject, boolean shouldBeValid) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(subject);
        boolean matches = matcher.matches();

        System.out.println("Testing pattern: " + pattern);
        System.out.println("Subject: " + subject);
        if (matches == shouldBeValid) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }
}


