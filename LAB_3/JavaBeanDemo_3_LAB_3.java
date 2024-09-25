package LAB_3;

//JavaBean class Person
class Person_1 {
	private String firstName;
	private String lastName;
	private int age;
	private String email;

	// Required no-argument constructor
	public Person_1() {}

	// Getter and setter methods for firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter and setter methods for lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter and setter methods for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and setter methods for email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

//Main class to demonstrate creating an instance of Person and using it
public class JavaBeanDemo_3_LAB_3 {
	public static void main(String[] args) {
		// Create an instance of Person
		Person_1 person = new Person_1();

		// Set properties of the person
		person.setFirstName("Mukesh");
		person.setLastName("Tiwari");
		person.setAge(19);
		person.setEmail("mukesh.tiwari@demo.com");

		// Print out the person's details
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Email: " + person.getEmail());
	}
}

