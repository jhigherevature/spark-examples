package instances;

public class Dog {
	public String name;
	public String breed;
	
	// a static int to manage the # of dogs created
	public static int count;
	
	/*
	 * Constructors are used as the 'first actions' to occur
	 * when an object is created from a class
	 */
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		count++;
	}
	
	public void speak (boolean sleepy) {
		String name = "name in method scope";
		
		if (sleepy)
			System.out.println("ZZZ");
		else
			System.out.println("My name is: " + this.name);
	}
	
	public Dog() {
		
	}
	
	public Dog(String name) { }
	
	public Dog(int number) { }
	
	public Dog(int num, String name) { }
	
	public Dog(String name, int num) { }
}
