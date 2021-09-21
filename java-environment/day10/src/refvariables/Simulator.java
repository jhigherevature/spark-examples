package refvariables;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * The 'new' keyword is used when creating
		 * objects from a class. This 'new' keyword
		 * indicates to our JVM that we want to 
		 * allocate space in memory for the object
		 * being created!
		 */
		Dog scooby = new Dog();
		scooby.name = "Scooby Doo";
		scooby.age = 7;
		scooby.weight = 100.0;
		scooby.breed = "Great Dane";
		scooby.bark();
		System.out.println(scooby.name);
		scooby.name = "Lisa";
		System.out.println(scooby.name);
		
		/*
		 * The double equals in java '==' is the equality
		 * operator. When used with primitives, it will check
		 * the value of those primitives (specifically it checks
		 * binary values...)
		 * 
		 * When comparing reference variables, this will compare
		 * the Memory Address of the variables!
		 */
		System.out.println("Comparisons:");
		Dog two = new Dog();
		two.name = "Lisa";
		two.age = 7;
		two.weight = 100.0;
		two.breed = "Great Dane";
		System.out.println(scooby == two);
		
		System.out.println(two.name == scooby.name);
		
		System.out.println(two.name.toUpperCase());
		System.out.println(two.name);
		System.out.println(two.name.length());
	}
}
