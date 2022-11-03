package constructors.thiskeyword;

/*
 * This class is used to show case the benefit of using the 
 * 'this' keyword to call other constructors on the same class
 * 
 * Compare the constructors of this class to those within 
 * the 'Data_Optimal" class
 */
public class Data_Nonoptimal {
	private String name;
	private int id;
	public double amount;
	
	public Data_Nonoptimal (String name, double amount) {
		System.out.println("Two argument constructor Called");
		this.name = name;
		this.amount = amount;
		this.id = IdGenerator.generateId();
		EventLogger.logObjectCreation(this);
	}

	public Data_Nonoptimal (String name) {
		System.out.println("Single argument constructor Called");
		this.name = name;
		this.amount = 100.00;
		EventLogger.logObjectCreation(this);
		this.id = IdGenerator.generateId();
	}
	
	public Data_Nonoptimal () {
		System.out.println("No Argument Constructor Called");
		this.name = "Default";
		this.amount = 100.00;
		this.id = IdGenerator.generateId();
		EventLogger.logObjectCreation(this);
	}
	
	public String toString() {
		return "Data [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
}
