package LAB_5;

//3. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

public class Sorting_In_ArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        // Display the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers+"\n");

        // Sort the ArrayList
        Collections.sort(numbers);

        // Display the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}
