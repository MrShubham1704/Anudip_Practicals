package LAB_2;
import java.util.Scanner;

public class Student_Grade_In_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Asking  for the Score to user
		System.out.println("Enter the student's score: ");
		int score = scanner.nextInt();
		char grade;

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		//Displaying the grade to user according to the score Entered
		System.out.println("The corresponding grade is: " + grade);
		scanner.close();
	}

}
