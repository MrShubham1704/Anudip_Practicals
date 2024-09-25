package LAB_6;

import java.util.Arrays;

public class SortIntegersAndCharacters {
	public static void main(String[] args) {
		// Sorting integers
		int[] numbers = {8, 4, 3, 5, 6};
		Arrays.sort(numbers);
		System.out.println("Sorted Integers: " + Arrays.toString(numbers));

		// Sorting characters
		char[] characters = {'C', 'O', 'I', 'P', 'U'};
		Arrays.sort(characters);
		System.out.println("Sorted Characters: " + Arrays.toString(characters));
	}
}
