package inheritance.basics;

public class Simulator {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.name = "Class A";
		a.number = 100;
		a.printInfo();
//		a.printInfo("Hello"); // Class A does not have an overloaded version
		
		ClassB b = new ClassB();
		b.name = "Class B";
		b.number = 99;		
		b.printInfo(); // inherited (overridden)
		b.printInfo("Hello"); // Class B - overloaded version
		
		System.out.println(a);
		System.out.println(b);
	}
}
