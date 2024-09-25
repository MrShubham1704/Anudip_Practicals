package Lab_1;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first No: ");
		int f=Integer.parseInt( sc.nextLine());
		System.out.println("Enter the Second No: ");
		int s=Integer.parseInt( sc.nextLine());
		if(f>s) {
			System.out.println(f+" is larger");		}
		else {
			System.out.println(s+" is larger");
		}
	}

}
