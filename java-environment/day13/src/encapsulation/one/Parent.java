package encapsulation.one;

/*
 * Access Modifiers : Keywords used to detail where code 
 * 		will be useable within a project.
 * 
 * Public : Accessible in any class within any package in a project
 * Protected : Accessible in any class within the SAME package OR
 * 				within a subclass in another package.
 * Default/Package-Private [no keyword] : Accessible in any class
 * 				within the SAME package
 * Private : Accessible within the same Class. 
 */
public class Parent {
	public String pubString = "Public Access";
	protected String proString = "Protected Access";
	String defString = "Default/Package-Private Access";
	private String priString = "Private Access";
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pubString);
		System.out.println(p.proString);
		System.out.println(p.defString);
		System.out.println(p.priString);
	}
}
