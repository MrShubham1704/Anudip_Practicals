package LAB_5;
import java.util.*;
public class Linked_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(13);
		ls.add(15);
		ls.add(17);
		System.out.println("Linked List Before Insertion: "+ ls);
		ls.addFirst(11);
		ls.addLast(19);
		ls.add(2,16);
		System.out.println("Linked List After Insertion(At beginning, middle, end): "+ ls);
	}

}
