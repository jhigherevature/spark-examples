package petstore;

import petstore.animals.Animal;

public class Customer {
	private String name;
	private Animal pet;
	private double money;
	
	public Customer(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public Animal getPet() {
		return pet;
	}
	public void setPet(Animal pet) {
		this.pet = pet;
	}
}
