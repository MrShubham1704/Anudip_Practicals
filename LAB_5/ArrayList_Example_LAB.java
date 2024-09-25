package LAB_5;
import java.util.ArrayList;

public class ArrayList_Example_LAB {
	public static void main(String[] args) {
		// Create and populate an ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// Print the original ArrayList
		System.out.println("Original ArrayList: " + list);

		// Specify the new element to replace the second element
		String newElement = "Blueberry";

		// Replace the second element (index 1) with the new element
		if (list.size() > 1) {
			list.set(1, newElement);
		} else {
			System.out.println("The ArrayList does not have a second element to replace.");
		}

		// Print the updated ArrayList
		System.out.println("Updated ArrayList: " + list);
	}
}

