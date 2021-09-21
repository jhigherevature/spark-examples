package animals;

public class Simulator {
	public static void main(String[] args) {
		Shark sully = new Shark("Sully", 5);
		sully.biome = "Ocean";
		
		Dog fido = new Dog("Fido", 10);
		fido.breed = "Golden Retriever";
		fido.wagTail();
		
		/*
		 * the println method will call the toString method
		 * on an object. This means if you provide your own
		 * implementation for the toString method, it will print
		 * whatever value you specify, instead of the hashcode!
		 */
		System.out.println(sully);
		System.out.println(fido);
		
		Shark sullyTwo = new Shark("Sully", 2);
		
		System.out.println(sully == sullyTwo);
		System.out.println(sully.equals(sullyTwo));
	}
}
