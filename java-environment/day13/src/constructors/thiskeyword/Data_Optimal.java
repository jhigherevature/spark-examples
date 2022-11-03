package constructors.thiskeyword;

/*
 * The first line of every constructor MUST be a call
 * to another constructor... Either, Java will try
 * to implicitly call the no-args constructor of the 
 * parent (i.e. 'super()' ), or you can call another 
 * specific constructor. 
 * 
 * Either the keyword 'super' can be used to reference a
 * constructor on the parent class, or the 'this' keyword 
 * can be used to reference another constructor of the 
 * current class. 
 * 
 * We use the 'this' keyword to reference other constructors 
 * on a class when we want to consolidate logic.
 * 
 * Compare the constructors of this class to those within 
 * the 'Data_Nonoptimal" class
 */
public class Data_Optimal {
	private String name;
	private int id;
	public double amount;
	
	public Data_Optimal (String name, double amount) {
		System.out.println("Two argument constructor Called");
		this.name = name;
		if (amount == 0.00) {
			this.amount = 100.0;
		} else {
			this.amount = amount;
		}
		this.id = IdGenerator.generateId();
		EventLogger.logObjectCreation(this);
	}

	public Data_Optimal (String name) {
		// The line below calls the two-argument constructor
		this(name, 0.00);
		System.out.println("Single Argument constructor Called");
	}
	
	public Data_Optimal () {
		// the line below calls the two-argument constructor
		this("Default", 0.00);
		System.out.println("No Argument Constructor Called");
	}
	
	public String toString() {
		return "Data [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
}
