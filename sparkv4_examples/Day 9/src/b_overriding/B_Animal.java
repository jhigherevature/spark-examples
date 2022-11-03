package b_overriding;

/** 1. Explain that Animal implicitly extends Object */
public class B_Animal extends Object {
	String name;
	int age;
	
	/** 2. explain overriding and the toString() method. Go back to Main.java and demonstrate change. */
	public String toString() {
		return "Animal Name: " + this.name + " Animal Age: " + this.age;
	}

	/** 2. When it is time to explain equivalent objects, come back to this file and go to
	 * 		Source > Generate hashCode() and equals()... 
	 *  3. Explain these methods */
	// creates a numeric result that depends on the values of age and name
	// if two objects have the same values for name and age, their hashcode will be the same
	// in a hashtable, they will be placed in the same bucket or replace one another (value-wise, they are the same value).
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	// the equals method takes in a generic object
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		// cast to animal to ensure that we can access its animal properties
		B_Animal other = (B_Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
