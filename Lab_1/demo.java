package Lab_1;
import java.util.Scanner;

class Calc
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public int div(int x,int y)
	{
		return x/y;
	}
	public int mod(int x,int y)
	{
		return x%y;
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first No: ");
		int a=Integer.parseInt(s.nextLine());
		System.out.println("Enter the Second No: ");
		int b=Integer.parseInt(s.nextLine());
		Calc c=new Calc();
		System.out.println("Result is: ");
		System.out.println("Addition is:"+ c.add(a,b));	
		System.out.println("Subtraction is:"+c.sub(a,b));	
		System.out.println("Multiplication is:"+c.mul(a,b));	
		System.out.println("Division is:"+c.div(a,b));	
		System.out.println("Modulus is:"+c.mod(a,b));	
		s.close();
	}

}

//
//1. Write a program to find the sum of two numbers entered by the user.
//2. Write a Java program to check whether a given number is even or odd.
//3.Write a java program to find greatest of 2 numbers.