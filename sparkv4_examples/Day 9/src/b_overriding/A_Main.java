package b_overriding;

/** The examples in this package build upon the classes already created in the inheritance package. 
 * 	There are separate files in this example purely to separate the concepts. Feel free to incorporate them
 *  into the files you already created.
 * */

public class A_Main {

	public static void main(String[] args) {
		/** 1. Create an animal and print it out. Note the output. */
			B_Animal anim = new B_Animal();
			anim.name = "Annie";
			anim.age = 15;
			System.out.println(anim);
			// optionally mention that println() implicitly calls the toString() method on objects. 
			// This is the method we want to change through overriding.
			// Go to Animal class
			System.out.println(anim.toString());
			
		/** 2. Create two equivalent dogs*/	
		C_Dog doug = new C_Dog();
		doug.name = "Doug";
		doug.age = 2;
		
		C_Dog doug2 = new C_Dog();
		doug2.name = "Doug";
		doug2.age = 2;
	
		/** 2. optionally print them out and note that they inherit the toString() implementation of Animal */	
		System.out.println(doug);
		System.out.println(doug2);
		
		/** 3. Compare the dogs with ==. Explain they are equivalent but not the same object. */	
		System.out.println(doug == doug2);
		
		/** 3. Go to Dog class and override hashCode and equals. Come back and use equals method */
		System.out.println(doug.equals(doug2));

		/** 4. Optionally give them different Dog member values to make them different */
		doug.hasChewToy = true;
		doug2.hasChewToy = false;
		// note that they seem equivalent because only their name and age are being compared with equals
		System.out.println(doug.equals(doug2));
		// override equals in Dog class to ensure they are equivalent objects and re-compare
		System.out.println(doug.equals(doug2));
	}
}
