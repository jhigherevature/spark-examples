package inheritancebasics;

public class Simulator {
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.name = "Class B";
		b.number = 99;
		
		b.printInfo(); // inherited (overridden)
		b.printInfo("Hello"); // overloaded
		
		ClassA a = new ClassA();
		a.printInfo();
	}
}
