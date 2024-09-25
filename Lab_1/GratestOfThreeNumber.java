package Lab_1;

import java.util.Scanner;

public class GratestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first No: ");
		int a=Integer.parseInt( s.nextLine());
		System.out.println("Enter the Second No: ");
		int b=Integer.parseInt( s.nextLine());
		System.out.println("Enter the Third No: ");
		int c=Integer.parseInt( s.nextLine());
		
		if(a>b  &&  a>c) {
			System.out.println(a +" is Larger than other two");
		}
		else if(b>a  &&  b>c) {
			System.out.println(b +" is Larger than other two");
		}
		else {
			System.out.println(c +" is Larger than other two");
		}
	}

}

