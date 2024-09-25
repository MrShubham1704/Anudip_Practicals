package LAB_2;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Check if the year is a leap year
		boolean isLeapYear = false;

		// Leap year conditions
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}

		// Output the result
		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		scanner.close();
	}

}



