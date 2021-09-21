package polymorphism;

public class Child extends Parent {
	public void speak() {
		System.out.println("Overridden in the Child Class");
	}
	
	public void play() {
		System.out.println("A method that only exists in the child class!");
	}
}
