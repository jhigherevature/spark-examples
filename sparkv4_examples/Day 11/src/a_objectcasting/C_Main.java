package a_objectcasting;

public class C_Main {
	public static void main(String[] args) {
		/** 1. Upcasting example */
			// dog reference variable, dalmatian object
			A_Dog myDog = new B_Dalmatian();
			
			// use bark, the only accessible member
			myDog.bark();
		
		/** 2. Downcasting example */
			// can I access Dalmatian members?
//					myDog.hat; // doesn't work
//					myDog.play(); // doesn't work
		
			// cast reference type to subclass to access more specific members
			// casting works with related types, like types in the same hierarchy
			((B_Dalmatian) myDog).play(); 

	}
}
