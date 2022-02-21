package encapsulation.two;

import encapsulation.one.Parent;

public class Simulator {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pubString);
//		System.out.println(p.proString); // error
//		System.out.println(p.defString); // error
//		System.out.println(p.priString); // error
		
//		Child c = new Child();
//		System.out.println(c.pubString);
//		System.out.println(c.proString); // error
	}
}
