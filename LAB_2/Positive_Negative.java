package LAB_2;
import java.util.Scanner;
public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Input from user
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();

		// Check conditions
		if (num > 0) {
			System.out.println(num + " is positive.");
		} else if (num < 0) {
			System.out.println(num + " is negative.");
		} else {
			System.out.println("The number is zero.");
		}
		scanner.close();
	}
}

