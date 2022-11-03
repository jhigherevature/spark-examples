package a_inheritance;

public class D_Main {

	public static void main(String[] args) {
		
		/** 1. Create an animal and demonstrate what properties/methods the object contains
		 * 	2. Note that it doesn't inherit from descendant classes.
		 * */
		A_Animal anim = new A_Animal();
		anim.name = "Annie";
		anim.age = 15;
//		anim.bark();	// Animals cannot bark
		
		/** 1. Create a dog and demonstrate what properties/methods the object contains
		 * 	2. Note that it inherits from Animal
		 * */
		B_Dog doug = new B_Dog();
		doug.name = "Doug";
		doug.age = 2;
		doug.hasChewToy = true;
		doug.bark();
		
		/** 1. Create a GoldenRetriever and demonstrate what properties/methods the object contains
		 * 	2. Note that it inherits from Animal and Dog
		 * */
		C_GoldenRetriever g = new C_GoldenRetriever();
		g.name = "G";
		g.bark();
	}
}
