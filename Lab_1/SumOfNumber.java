package Lab_1;

import java.util.Scanner;
class cal
{
	public int add(int x,int y)
	{
		return x+y;
	}
}
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first No: ");
		int a=Integer.parseInt( s.nextLine());
		System.out.println("Enter the Second No: ");
		int b=Integer.parseInt( s.nextLine());
		cal c=new cal();
//		Results
		System.out.println("Result: ");
		System.out.println("Addition is:"+ c.add(a,b));	
		
	}

}
