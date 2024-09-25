package LAB_5;


//2. Write a Java program that reads a string from the user and uses StringTokenizer to count the number of words in the string.
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Tokenizer_With_Count_Method {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();

		// Prompt the user to enter delimiters
		System.out.println("Enter delimiters (e.g., space, comma, etc.): ");
		String delimiters = scanner.nextLine();

		// Create a StringTokenizer with the input string and delimiters
		StringTokenizer tokenizer = new StringTokenizer(inputString, delimiters);

		// Count the number of tokens (words) in the string
		int wordCount = tokenizer.countTokens();

		System.out.println("The number of words in the string is: " + wordCount);
		scanner.close();
	}
}
