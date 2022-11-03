package c_overloading;

/** 1. Create variables, create various constructors. Explain constructors repeat a lot of code. */

public class A_Person {
	// variables
	public String name;
	public int age;
	public String profession;
	
	public A_Person() {
		this.name = "Charlie";
		this.age = 20;
		this.profession = "student";
	}
	
	public A_Person(String name) {
		this.name = name;
		this.age = 20;
		this.profession = "student";
	}
	
	public A_Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.profession = "student";
	}
	
	public A_Person(String name, String profession) {
		this.name = name;
		this.age = 20;
		this.profession = profession;
	}
	
	/** 2. Optionally create a bad example of overloading (same constructor as the one before it, just different parameter names */
//	public A_Person(String profession, String name) {
//		this.name = name;
//		this.age = 20;
//		this.profession = profession;
//	}
}
