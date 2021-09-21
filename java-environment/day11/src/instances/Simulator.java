package instances;

public class Simulator {
	public static void main(String[] args) {
		Dog fido = new Dog("Fido", "Golden Retriever");
		System.out.println(Dog.count);
		Dog two = new Dog("Two", "Labrador");
		System.out.println(Dog.count);
				
		System.out.println(fido.name); // Fido
		System.out.println(fido.breed); // retr
		System.out.println(two.name); // Two
		System.out.println(two.breed); // lab
		
	}
}
