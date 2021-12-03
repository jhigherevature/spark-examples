package petstore.inventory;

import petstore.interfaces.Purchaseable;

/*
 * Since the class Item is abstract, it is not required
 * to override the "purchase" method inherited from the
 * interface "Purchaseable". The first non-abstract class 
 * that inherits an abstract method must override an 
 * abstract method. However, since many classes will 
 * potentially extend the Item class, and the functionality
 * will be similar (compare the price with the amount of
 * money the user has), 
 */
public abstract class Item implements Purchaseable {
	protected double price;
	protected long id;
	protected String name;
	protected String description;
	
	public Item (double price, String name, String description) {
		this.price = price;
		this.name = name;
		this.description = description;
		this.id = IdGenerator.generateId();
	}
	
	public double purchase(double amount) {
		if (amount >= this.price) {
			double change = amount-price;
			System.out.println("You purchased: " + this.name);
			System.out.println("Your change is: " + change);
			return change;
		} else {
			System.out.println("You don't have enough money for this!");
			return amount;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
