package LAB_2;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//Asking the user to enter the number to print its table upto 10
		System.out.println("Enter the No: ");
		int n=Integer.parseInt( s.nextLine());
		System.out.println("Multiplication Table of "+n+" is");
		//Logic of Printing table
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));

		}
		s.close();//Closing Scanner Object
	}

}
