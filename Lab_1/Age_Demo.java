package Lab_1;

import java.util.Scanner;

public class Age_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age=Integer.parseInt( obj.nextLine());
		if(age>=18) {
			System.out.println("You can Vote!!..");
		}
		else {
			System.out.println("You Cann't Vote..");
		}
	}

}
