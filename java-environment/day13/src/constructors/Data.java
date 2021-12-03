package constructors;

/*
 * The first line of every constructor MUST be a call
 * to another constructor... Either, Java will try
 * to implicitly call the no-args constructor of the 
 * parent (i.e. super() ), or you can call a specific
 * constructor. 
 * 
 * Either the keyword super can be used to reference the
 * parent class, or the 'this' keyword can be used to 
 * reference the current class. The 'this' keyword is used 
 * with constructors on a class to consolidate logic.
 */
public class Data {
	private String name;
	private int id;
	public double amount;
	
	public Data (String name, double amount) {
		System.out.println("Two argument constructor Called");
		this.name = name;
		this.amount = amount;
		DatabaseCommunicator.sendToDatabase(this);
		this.id = IdGenerator.generateId();
		// LoggerSystem.logEvent();
	}

	public Data (String name) {
		// The line below calls the two-argument constructor
		this(name, 0.00);
		System.out.println("Single Argument constructor Called");
	}
	
	public Data () {
		// the line below calls the two-argument constructor
		this("Default", 0.00);
		System.out.println("No Argument Constructor Called");
	}
	
	public String toString() {
		return "Data [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
}
