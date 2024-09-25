package LAB_3;

//Abstract class Employee
abstract class Employee {
	// Abstract method to calculate pay (must be implemented by subclasses)
	public abstract double calculatePay();
}

//Concrete subclass SalariedEmployee
class SalariedEmployee extends Employee {
	private double salary; // Monthly salary


	public SalariedEmployee(double salary) { // Constructor
		this.salary = salary;
	}

	// Implementing calculatePay() method for SalariedEmployee
	@Override
	public double calculatePay() {
		return salary; // Monthly salary is return
	}
}

//Concrete subclass HourlyEmployee
class HourlyEmployee extends Employee {
	private double hourlyRate; // Hourly rate
	private double hoursWorked; // Number of hours worked

	// Constructor
	public HourlyEmployee(double hourlyRate, double hoursWorked) {
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	// Implementing calculatePay() method for HourlyEmployee
	@Override
	public double calculatePay() {
		return hourlyRate * hoursWorked; // Pay based on hourly rate and hours worked
	}
}

//Main program to create objects and test
public class Inheritance_With_Abstract_Class {
	public static void main(String[] args) {
		// Creating objects of both subclasses
		SalariedEmployee salariedEmp = new SalariedEmployee(5000); // Monthly salary of 5000
		HourlyEmployee hourlyEmp = new HourlyEmployee(20, 40); // Hourly rate of 20, worked 40 hours

		// Calling calculatePay() method for each object
		double salariedPay = salariedEmp.calculatePay();
		double hourlyPay = hourlyEmp.calculatePay();

		// Outputting the calculated pay
		System.out.println("Salaried Employee Pay: $" + salariedPay);
		System.out.println("Hourly Employee Pay: $" + hourlyPay);
	}
}



