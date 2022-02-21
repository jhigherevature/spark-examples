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
		Dog clone = new Dog();
		clone.name = "Scooby Doo";
		clone.age = 7;
		clone.weight = 100.0;
		clone.breed = "Great Dane";
		System.out.println("scooby == clone:"+  (scooby == clone));
		System.out.println("scooby.name == clone.name:" + (scooby.name == clone.name));
	}
}
