package keywordstatic;

/*
 * Variables and methods that are marked as 'static'
 * are shared across all instances (objects) of a class.
 * 
 * You can access static fields and methods without 
 * needing an object created by calling the class directly.
 */
public class Account {
	// static variable
	static int count;
	
	public static void staticAccountMethod() {
		System.out.println("This method is Static within the account class!");
//		System.out.println("My accountHolder is: " + accountHolder);
	}
	
	// instance variables
	String accountHolder;
	long accountId;
	double accountValue;
	
	// instance method
	public void printAccountInfo() {
		System.out.println("AccountHolder [instance]: " + accountHolder
				+ "\nAccountId [instance]: " + accountId
				+ "\nAccountValue [instance]: " + accountValue
				+ "\nCount [static]: " + count
				+ "\n==== ==== ====");
	}
}
