package LAB_4;

import java.util.Scanner;

public class Remove_WhiteSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();

		// Remove white spaces without using predefined function
		StringBuilder stringWithoutSpaces = new StringBuilder();
		//StringBuilder in Java is a class used to create a mutable, or in other words, 
		//a modifiable succession of characters.

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) != ' ' && inputString.charAt(i) != '\t') {
				stringWithoutSpaces.append(inputString.charAt(i));
			}
		}
		//OR
		// Remove white spaces using predefined function
		//String stringWithoutSpaces = inputString.replaceAll("\\s", "");

		System.out.println("String without white spaces (without using predefined function): " + stringWithoutSpaces.toString());
		scanner.close();

	}
}


