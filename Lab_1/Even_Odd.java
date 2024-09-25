package Lab_1;
import java.util.Scanner;
public class Even_Odd {
	public static void check(int a) {
		if(a%2==0)
			System.out.println(a+" is Even Number");
		else
			System.out.println(a+" is Odd Number");
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No: ");
		int r=Integer.parseInt( s.nextLine());
		check(r);
	}
}
