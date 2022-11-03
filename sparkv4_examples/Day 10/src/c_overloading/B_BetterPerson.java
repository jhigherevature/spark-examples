package c_overloading;

/** 1. Create same various and constructors from Person into this class. Use this() call to show more efficiency. */

public class B_BetterPerson {
	
	public String name;
	public int age;
	public String profession;
	
	public B_BetterPerson() {
		this("Charlie", 20, "student");
	}
	
	public B_BetterPerson(String name) {
		this(name, 20, "student");
	}
	
	public B_BetterPerson(String name, int age) {
		this(name, age, "student");
	}
	
	public B_BetterPerson(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
}
