package c_composition;


/** 1. Create a dog object and access its collar property. 
 * Note that you can also access collar's color property in same way, as they are both objects. 
 * Reiterate composition.*/

public class C_Main {
	public static void main(String[] args) {
		A_Dog dog = new A_Dog();
		System.out.println(dog.collar.color);
		
	}
}
