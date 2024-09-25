package LAB_3;

class Calculator_Demo {

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add two doubles
	public double add(double a, double b) {
		return a + b;
	}

	// Method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	//	A variable number of Integer
	public int add(int a, int b, int c,int d,int e) {
		return a + b + c + d + e;
	}
}

public class Overloading_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator_Demo calc = new Calculator_Demo();

		System.out.println("Sum of 2 and 3: " + calc.add(2, 3)+"\n");//Calling the Two integers Method()
		System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5)+"\n");//Calling the Two Double Method()
		System.out.println("Sum of 2, 3 and 4: " + calc.add(2, 3, 4)+"\n");//Calling the 3 integers Method()
		System.out.println("Sum of 2, 3, 4,6 and 5: " + calc.add(2, 3, 4, 6, 5)+"\n");//Calling the variable number of integers Method()

	}

}
