package LAB_4;

//Base Class is Declare
class Shape{
	public void draw() {
		System.out.println("Drawing Shape");

	}
}

//Subclass Circles 
class Circles extends Shape{// Circles Class is created because the Circle is already created in the Same Package
	public void draw() {
		super.draw();
		System.out.println("Drawing Circle");

	}
}

//Main Method 
public class Super_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles c=new Circles();// Object of the Circles Class
		c.draw();
		
	}
}
