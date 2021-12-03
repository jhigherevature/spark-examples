package imports;

/*
 * By default, your Java program will search the
 * following locations when trying to determine a
 * datatype for a class, in this order:
 * 1. Classes used in import statements
 * 2. Other classes within the current package
 * 3. Classes within the java.lang package of the JRE
 * 
 * import statements are used to clarify which version
 * of certain classes to use, or to leverage functionality
 * from other parts of your project.
 */
import keywordthis.Account;

public class ImportSimulator {
	public static void main(String[] args) {
		System.out.println("This prints to the console!");
		
		Account thisaccount = new Account("Joseph", 2021, 100.0);
		
		/*
		 * You can also use the "Fully Qualified Class Name"
		 * FQCN to reference a class without the import
		 * statement.
		 *  The FQCN is the name of the class preceeded by 
		 *  the package declaration for the class.
		 */
		keywordstatic.Account staticAccount = new keywordstatic.Account();
	}
}
