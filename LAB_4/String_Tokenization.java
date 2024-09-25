package LAB_4;

//1.Write a Java program that reads a string from the user and uses 
//StringTokenizer to split the string into individual words. Print each word on a new line.

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Tokenization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();

		// Prompt the user to enter delimiters
		System.out.println("Enter delimiters (e.g., space, comma, etc.): ");
		//A delimiter is a character or symbol used in computer code that separates words, data, or characters.
		String delimiters = scanner.nextLine();

		// Create a StringTokenizer with the input string and delimiters
		StringTokenizer tokenizer = new StringTokenizer(inputString, delimiters);
		//The string tokenizer class allows an application to break a string into tokens.

		// Display the tokens
		System.out.println("The tokens are:");
		while (tokenizer.hasMoreTokens()) {//hasMoreTokens() Tests if there are more tokens available from this tokenizer's string.
			System.out.println(tokenizer.nextToken());//NextToken is a string that is returned in some command responses
		}

		scanner.close();
	}
}


