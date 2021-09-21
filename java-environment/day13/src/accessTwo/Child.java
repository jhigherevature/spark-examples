package accessTwo;

import access.Parent;

public class Child extends Parent {
	
	public Child() {
		this("Public String - No argument used");
	}
	
	public Child(String pubString) {
		super();
		this.pubString = pubString;
	}
	
	public void printMyFields() {
		System.out.println(this.pubString);
		System.out.println(this.proString);
//		System.out.println(this.defString);
//		System.out.println(this.priString);
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pubString);
		/*
		 * We still get an error when trying to access
		 * a protected field on a Parent object directly!
		 * The protected access modifier gives access to 
		 * a field as if we wrote the field within the child
		 * class!
		 */
//		System.out.println(p.proString);
		
		Child c = new Child();
		System.out.println(c.pubString);
		System.out.println(c.proString);
		c.printMyFields();
	}
}
