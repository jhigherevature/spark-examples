package access;

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
