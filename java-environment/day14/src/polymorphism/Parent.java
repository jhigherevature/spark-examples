package polymorphism;

public class Parent {
	// Overloaded method
	public void method() {
		System.out.println("No args");
	}
	// Overloaded method
	public void method(String input) {
		System.out.println("String input - " + input);
	}
	
	public void speak() {
		System.out.println("This is the Parent Method");
	}
}
