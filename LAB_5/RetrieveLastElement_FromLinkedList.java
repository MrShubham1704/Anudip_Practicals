package LAB_5;
import java.util.LinkedList;

public class RetrieveLastElement_FromLinkedList {
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

		// Retrieve but not remove the last element
		String lastElement = list.peekLast();

		// Print the last element
		System.out.println("Last element (retrieved but not removed): " + lastElement+"\n");
		
		// Print the original LinkedList after retrieved of element
		System.out.println("Original LinkedList: " + list+"\n");
	}
}

