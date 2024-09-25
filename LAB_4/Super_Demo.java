package LAB_4;

class Persons{
	String name;
	int age;
	Persons(){}
	public Persons(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

class Students extends Persons{
	int grade;
	public Students(String name,int age,int grade) {
		super(name,age);
		this.grade=grade;
		System.out.println("Name is: "+name+"\nAge is: "+age+"\nGrade is: "+grade);
	}
}
public class Super_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students("Mukesh",19,90);
	}

}
