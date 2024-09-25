package LAB_2;

import java.util.Scanner;

public class Sum_Of_Entered_Number {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No: ");
		int number=Integer.parseInt( s.nextLine());
		//Logic to get the sum of the entered Number
		while(number!=0) {
			int digit = number % 10;
			sum=sum+digit;
			number /= 10;

		}
		//Printing the Result
		System.out.println("Sum is: "+ sum);
		s.close();
	}

}
