package b_abstraction.a_classes;

import b_abstraction.b_interfaces.Purchasable;

/** 1. Create abstract base class, including:
 * 	- fields
 * 	- constructor
 * 	- getAnimalPrice method
 * 	- toString
 * 	- abstract talk method
 * 
 * 	Explain as you go. DO NOT include implements Purchasable until after that interface is created
 * */
public abstract class A_Animal implements Purchasable {
	public String name;
	public double price;
	
	public A_Animal(String name) {
		// implicit call to superclass constructor
		super();
		this.name = name;
		/*
		 * We can use constructors to call any initial functionality
		 * we would like. For example, generating a price based on
		 * the type of animal selected...
		 */
		this.price = getAnimalPrice(this);
	}
	
	// This will return a price based on the Animal Type
	public double getAnimalPrice(A_Animal animal) {
		if (animal instanceof B_Dog)
			return 75.00;
		if (animal instanceof B_Cat)
			return 60.00;
		else return 50.00;
	}

	public String toString() {
		return "Animal [name=" + name + 
				", price=" + price + 
				", type=" + this.getClass() + "]";
	}
	
	public abstract void talk();
}
