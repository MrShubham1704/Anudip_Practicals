package LAB_5;

import java.util.LinkedList;

import java.util.ListIterator;

public class LinkedList_Demo {
	public static void main(String[] args) {
		// Create and populate a LinkedList
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Elderberry");

		// Print the original LinkedList
		System.out.println("Original LinkedList: " + list+"\n");

		// Get a ListIterator starting from the end of the list
		ListIterator<String> iterator = list.listIterator(list.size());

		// Iterate in reverse order
		System.out.println("LinkedList in reverse order: \n");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}

