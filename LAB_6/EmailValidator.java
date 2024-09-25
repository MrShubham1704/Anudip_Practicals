package LAB_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		// Sample email addresses to test
		String[] emails = {
				"valid.email@example.com",
				"invalid-email@.com",
				"another.valid-email123@domain.co",
				"invalid@domain..com",
				"valid-email@domain.com"
		};

		// Regular expression for validating email addresses
		String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(emailRegex);

		// Validate each email address
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + "  is a valid email address.");
			} else {
				System.out.println(email + "  is not a valid email address.");
			}
		}
	}
}
