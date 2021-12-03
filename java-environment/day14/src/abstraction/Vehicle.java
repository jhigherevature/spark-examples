package abstraction;

/*
 * Note, that abstract classes are abstract entities. There are
 * two types of abstract entities in Java, classes which use the
 * keyword abstract, and interfaces!
 * 
 * The keyword abstract in java will do two things:
 * 		1 - It will allow the class to contain abstract methods!
 * 			1.1 - An abstract method, is a method that does not have
 * 				a method body! This method body will have to be implemented
 * 				by a non-abstract subclass.
 * 		2 - Prevents Java from creating a reference variable for
 * 			the abstract class using that abstract class' constructor(s).
 * 			NOTE: You can still create the abstract class reference variable
 * 			you just have to use a subclasses constructor to do so.
 */
public abstract class Vehicle {
	public abstract void propel();
	public abstract void steer();
	
	public void honk() {
		System.out.println("Honk Honk");
	}
}
