package polymorphism;

public class Simulator {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.speak();
		Child c = new Child();
		c.speak();
		/*
		 * Covariance (a.k.a. covariant typing) allows you to 
		 * reference a child object as if it were a parent, and
		 * vice versa.
		 */
		Parent manChild = new Child();
		manChild.speak();
//		((Child)manChild).play();
//		
////		Parent other = new NotRelatedToChild();
////		((Child)other).play();
//		if (manChild instanceof Child) {
//			// Casting a parent to a child
//			((Child)manChild).play();
//		}
	}
}
