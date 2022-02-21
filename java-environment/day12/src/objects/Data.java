package objects;

/*
 * The Object class is the implicit superclass of all
 * classes in Java
 */
public class Data {
	public static void main(String[] args) {
		Data d_1 = new Data("Joseph", 1, 100.0);
		System.out.println(d_1);
		Data d_2 = new Data("Joseph", 1, 100.0);
		System.out.println(d_2);
		
		System.out.println("D_1 == D_2: " + (d_1 == d_2));
		System.out.println("D_1.equals(D_2): " + d_1.equals(d_2));
	}
	
	public String name;
	public long id;
	public double amount;

	public Data(String name, long id, double amount) {
		this.name = name;
		this.id = id;
		this.amount = amount;
	}

	/*
	 * The following is NOT an example of good hashCode,
	 * but simply provided to showcase the relationship 
	 * between the hashCode, equals and toString methods
	 * 
	 * The '@Override' annotation is used to communicate 
	 * that the following method is changing behavior that
	 * is inherited from a parent class (the Object class
	 * in this case)
	 * 
	 * Note: an annotation is a metadata tag that may be
	 * placed prior to the declaration of a class, method
	 * or variable to provide context or typically have a 
	 * programmatic implication.
	 */
	@Override
	public int hashCode() {
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// Check if the memory address is the same
		if (this == obj)
			return true;
		
		// Check if the argument is a null reference
		if (obj == null)
			return false;
		
		// Check if argument is Not of type 'Data'
		if (!(obj instanceof Data))
			return false;
		
		// Polymorphic reference. More on this later...
		Data d = (Data)obj;
		
		if (d.amount != this.amount)
			return false;
		if (d.id != this.id)
			return false;
		if (!d.name.equals(this.name))
			return false;

		return true;
	}
	
	/*
	 * The toString method is called automatically by
	 * System.out.prinln when an object reference
	 * is detected by Java. If you do not provide an
	 * overridden version of the toString method, then
	 * the hashCode of an object will print instead.
	 * By default, this hashcode relates to the memory
	 * address of the object in question.
	 * 
	 * Note that the use of the keyword 'this' in the 
	 * toString method below is not required. It is 
	 * included to clarify which variables 'name',
	 * 'id' and 'amount' are referring to.
	 */
	public String toString() {
		return "Data [name=" + this.name + 
				", id=" + this.id + 
				", amount=" + this.amount + "]";
	}
}
