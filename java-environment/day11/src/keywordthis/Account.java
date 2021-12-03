package keywordthis;

/*
 * The keyword 'this' is used to reference the current
 * instance of an object (like looking into a mirror
 * and seeing yourself).
 * 
 * The this keyword is used to distinguish between 
 * method parameters and the associated field on a class.
 * Note, it is a convention to use the same name for
 * a parameter and the name of a field on a class, but
 * not a requirement.
 * 
 * Typically, when conventions are followed, that 
 * allows for automation of tasks or creating tools which
 * can rely on those conventions to make development 
 * easier/faster
 */
public class Account {
	static int count;

	String accountHolder;
	long accountId;
	double accountValue;
	
	/*
	 * Constructor for the class 'Account'
	 */
	public Account(String accountHolder, long accountId, double accountValue) {
		this.accountHolder = accountHolder;
		this.accountId = accountId;
		this.accountValue = accountValue;
		/*
		 * We will increase count each time we create an
		 * Account object using this constructor 
		 */
		count++;
	}
	
	public void deposit(int amount) {
		/*
		 * Here, the keyword 'this' is not required
		 * since there are no other variables that
		 * we could be referencing when using the name
		 * 'accountValue'
		 */
		this.accountValue += amount;
	}
}
