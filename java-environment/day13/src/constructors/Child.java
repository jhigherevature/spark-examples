package constructors;

public class Child extends Parent {
	public Child(String param) {
		super(param);
	}
	
	// Java does not allow for circular/recursive constructor calls
//	public Child() {
//		this(99);
//	}
//	public Child(int value) {
//		this();
//	}
}
