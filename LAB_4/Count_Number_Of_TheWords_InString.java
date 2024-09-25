package LAB_4;

import java.util.Scanner;

public class Count_Number_Of_TheWords_InString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();

		// Trim leading and trailing spaces and initialize word count
		inputString = inputString.trim();
		int wordCount = 0;

		// Check if the input string is empty
		if (inputString.isEmpty()) {
			System.out.println("The number of words in the string is: " + wordCount);
			return;
		}

		boolean isWord = false;
		int endOfLine = inputString.length() - 1;

		// Iterate through each character of the string
		for (int i = 0; i < inputString.length(); i++) {
			// Check if the character is a letter
			if (Character.isLetter(inputString.charAt(i)) && i != endOfLine) {
				isWord = true;
			} else if (!Character.isLetter(inputString.charAt(i)) && isWord) {
				wordCount++;
				isWord = false; // Reset isWord
			} else if (Character.isLetter(inputString.charAt(i)) && i == endOfLine) {
				wordCount++;
			}
		}

		System.out.println("The number of words in the string is: " + wordCount);
		scanner.close();
	}

}


