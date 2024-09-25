package LAB_3;

//Base Class
class Vehicle{
	void move() {
		System.out.println("Vehical is Moving\n");
	}
}
//Base class of the Vehicle Class
class Car extends Vehicle{
	//As not mention in Questions keep this class empty
}

//Base class of the Vehicle Class
class Bike extends Vehicle{
	//As not mention in Questions keep this class empty
}

//Main Method
public class Interface_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();//Car's Class Object
		c.move();
		Bike b=new Bike();//Bike's Class Object
		b.move();
	}

}



//1.	Create a superclass Person with attributes name and age, and a method display(). Create a subclass Student that adds an attribute studentID. Write a program to create a Student object and display all its attributes.
//
//2.	Create a superclass Calculator with a method add(int a, int b). Create a subclass AdvancedCalculator that overloads the add method to handle three integers. 
//
//3.	Create a superclass Vehicle with a method move(). Create subclasses Car and Bike that inherit from Vehicle. Write a program to create objects of Car and Bike and call the move() method on each.

