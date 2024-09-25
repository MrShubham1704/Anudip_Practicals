package LAB_3;

//Creating the base class Named as the "Person"
class Person{
	String name; int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display(String name,int age) {
		System.out.print("Name is: "+ name+"\nAge is: "+age);
	}
}

//Creating the Derived class Named as the "Student"
class Student extends Person{
	int StudentID;
	public Student(String name,int age,int StudentID)
	{
		super(name,age);
		this.StudentID=StudentID;
		System.out.print("Name is: "+ name+"\nAge is: "+age+"\nStudent ID is: "+StudentID);

	}

}

public class Interface_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Mukesh",19,10);//Creating the Object of the Student Class

	}

}
