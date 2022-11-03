package a_encapsulation.a_accessmodifiers.b;

import a_encapsulation.a_accessmodifiers.a.A_SameClass;

public class A_UnrelatedClass {
	// try to access them INDIRECTLY within a class in another package
	// trying to directly access the protected variable
	
	/** 1. access them within unrelated class in different package */
	public static void main(String[] args) {
		// create a data object
		A_SameClass data = new A_SameClass();
		
		// print out each variable
//		System.out.println(data.pri); // within the same class
//		System.out.println(data.def); // within the same package
//		System.out.println(data.pro); // within the same class OR package OR subclass (cannot access what isn't inherited)
		System.out.println(data.pub); // always available
	}
}
