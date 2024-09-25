package LAB_3;

//Base Class
class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
}

//Creating the derived class that extends Calculator Class
class AdvancedCalculator extends Calculator{
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class Iterface_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedCalculator ac=new AdvancedCalculator();
		int re=ac.add(10,20,30);
		System.out.println("Result is: "+re);
	}
}
