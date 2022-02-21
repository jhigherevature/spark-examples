package inheritance.basics;

public class ClassA extends java.lang.Object {
	public String name;
	public int number;
	
	public void printInfo() {
		System.out.println("name is: " + name
				+", number is: " + number);
	}
	
	public String toString() {
		return "Something Random";
	}
}
