package b_abstraction.a_classes;

import b_abstraction.b_interfaces.Purchasable;

/** 1. Create Item class. explain all class members and constructors. 
 * DO NOT implement Purchasable until after interface is introduced. */
public abstract class C_Item implements Purchasable {
	public int id;
	public double price;
	private static int currentId = 1000;
	
	public C_Item(double price) {
		// implicit call to superclass constructor
		super();
		this.id = currentId++;
		this.price = price;
	}
	
	public String toString() {
		return "Item [id=" + id + 
				", price=" + price + 
				", type=" + this.getClass() + "]";
	}

}
