package a_encapsulation.b_getterssetters;

/** 1. Create cat class. Explain use and syntax of getters and setters. 
 * 	- create read-only data by removing setters
 * 	- opportunity to perform input validation for setters
 * */
public class A_Cat {
	private String name;
	private int age;
	
	// getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// setters
	public void setName(String name) {
		/** 2. Optionally perform input validation in setter and describe its usefulness */
		// check if empty.
//		if (name == "") {
//			this.name = "Garfield";
//		} else {
//			this.name = name;
//		}
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
