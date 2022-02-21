package encapsulation.one;

/*
 * The OOP Principle 'Encapsulation' requires that
 * you declare all fields as private, and provide
 * selective access/exposure to the fields using
 * Getter and Setter (a.k.a. accessor and mutator)
 * methods.
 * 
 * The convention for getter methods is to return
 * a datatype that matches the variable, and name
 * the method get[VarName].
 * 
 * The convention for setter methods is to return
 * void, but declare one parameter that matches
 * the datatype and name of the field. The name of
 * the method should be set[VarName]
 * 
 */
public class GetterSetterConventions {
	private String name;
	private int id;
	private double weight;
	private String email;
	
	/*
	 * Often, developers will lazily declare all 
	 * getters and setters as public, but the true
	 * power of getters and setters lies in the 
	 * ability to control access for reading and
	 * writing to data separately and in a nuanced
	 * way!
	 */
	// Read name anywhere in project
	public String getName() {
		return name;
	}
	// only change name in subclasses and classes in same package
	protected void setName(String name) {
		this.name = name;
	}
	
	// only read id in same package
	int getId() {
		return id;
	}
	// only change id in same package
	void setId(int id) {
		this.id = id;
	}
	
	// read weight anywhere
	public double getWeight() {
		return weight;
	}
	// change weight anywhere
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// read email in same package
	String getEmail() {
		return email;
	}
	// only change email in this class
	private void setEmail(String email) {
		this.email = email;
	}
}

