package LAB_3;

//JavaBean class Car
class Car1 {//Car1 class name taken because Car has already in my Package
	private String make;
	private String model;
	private int year;
	private String color;

	// Required no-argument constructor
	public Car1() {}

	// Getter and setter methods for make
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	// Getter and setter methods for model
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Getter and setter methods for year
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Getter and setter methods for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

//Main class to demonstrate creating an instance of Car and using it
public class JavaBaenDemo_4_Lab_3 {
	public static void main(String[] args) {
		// Create an instance of Car
		Car1 car = new Car1();

		// Set properties of the car
		car.setMake("Mukesh");
		car.setModel("Tiwari");
		car.setYear(2005);
		car.setColor("Red");

		// Print out the car details
		System.out.println("Car Make: " + car.getMake());
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Car Year: " + car.getYear());
		System.out.println("Car Color: " + car.getColor());
	}
}

