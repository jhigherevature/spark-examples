package a_encapsulation.a_accessmodifiers.a;

public class A_SameClass {
	/** 1. create different kinds of variables with different levels of access */
	private String pri = "Private Variable";
	String def = "Default Variable";
	protected String pro = "Protected Variable";
	public String pub = "Public Variable";
	
	/** 2. access them within the same class */
	public static void main(String[] args) {
		// create a data object
		A_SameClass data = new A_SameClass();
		
		// check accessibility of each variable
		System.out.println(data.pri); // within the same class
		System.out.println(data.def); // within the same package
		System.out.println(data.pro); // within the same class OR package OR subclass*
		System.out.println(data.pub); // always available
	}
}
