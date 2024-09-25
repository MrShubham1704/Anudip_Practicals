package LAB_4;

import java.util.Scanner;

public class WordOccurrence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();

		// Prompt the user to enter the word to find
		System.out.println("Enter the word to find its occurrence: ");
		String word = scanner.nextLine();

		// Find the number of occurrences using predefined functions
		int occurrences = findWordOccurrences(inputString, word);

		System.out.println("The word '" + word + "' occurs " + occurrences + " times in the given string");
		scanner.close();
	}

	public static int findWordOccurrences(String inputString, String word) {
		String[] words = inputString.split("\\s+");
		int count = 0;
		for (String w : words) {
			if (w.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
