package LAB_2;

//Class Animal 
class Animal{
	public void makeSound() {
		System.out.println("Buzz");//produce the sound of the bee
	}
}
//Derived Class named as the "Bog"
class Dog  extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	}
}
public class Inhertance_Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog  b=new Dog ();//creating the object of the Derived class that is "Dog"
		b.makeSound();
	}

}
