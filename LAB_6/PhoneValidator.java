package LAB_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
	public static void main(String[] args) {
		// Sample phone numbers to test
		String[] phoneNumbers = {
				"(123) 456-7890",
				"(987) 654-3210",
				"(123) 456-789",    // Invalid format
				"123 456-7890",     // Missing parentheses
				"(123)456-7890",    // Missing space
				"(123) 456 7890",   // Missing hyphen
				"(123) 456-78901"   // Too many digits
		};

		// Regular expression for validating phone numbers
		String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
		Pattern pattern = Pattern.compile(phoneRegex);

		// Validate each phone number
		for (String phoneNumber : phoneNumbers) {
			Matcher matcher = pattern.matcher(phoneNumber);
			if (matcher.matches()) {
				System.out.println(phoneNumber + " is a valid phone number.");
			} else {
				System.out.println(phoneNumber + " is not a valid phone number.");
			}
		}
	}
}

