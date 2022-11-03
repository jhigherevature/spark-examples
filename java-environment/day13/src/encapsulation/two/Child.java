package encapsulation.two;

import encapsulation.one.Parent;

public class Child extends Parent {
	public void printMyFields() {
		System.out.println(this.pubString);
		System.out.println(this.proString);
//		System.out.println(this.defString); // not inherited
//		System.out.println(this.priString); // not inherited
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pubString);
//		System.out.println(p.proString);
		
		Child c = new Child();
		System.out.println(c.pubString);
		System.out.println(c.proString);
	}
}
