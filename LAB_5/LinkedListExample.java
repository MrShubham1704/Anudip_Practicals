package LAB_5;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// Create a LinkedList of Integer
		LinkedList<Integer> list = new LinkedList<>();

		// Add some elements to the LinkedList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Print all the elements in the LinkedList
		System.out.println("LinkedList elements:");
		for (Integer element : list) {
			System.out.println(element);
		}
	}
}
