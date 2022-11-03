package b_staticvsinstance;

/*
 * Variables and methods that are marked as 'static'
 * are shared across all instances (objects) of a class.
 * 
 * You can access static fields and methods without 
 * needing an object created by calling the class directly.
 */
public class A_Account {
	// static variable
	static int count;
	
	// instance variables
	String accountHolder;
	long accountId;
	double accountValue;
	
	// this constructor now increases 'count' each time a new Account is created
	public A_Account() {
		count++;
	}
	
	// static method
	public static void staticAccountMethod() {
		System.out.println("This method is static to the Account class.");
//		System.out.println("accountHolder is: " + accountHolder); // error - cannot reference non-static field in static method
	}
	
	// instance method
	public void printAccountInfo() {
		System.out.println("AccountHolder [instance]: " + accountHolder
				+ "\nAccountId [instance]: " + accountId
				+ "\nAccountValue [instance]: " + accountValue
				+ "\nCount [static]: " + count);
	}
	
}
