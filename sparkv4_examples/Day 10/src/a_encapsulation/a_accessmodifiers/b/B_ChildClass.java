package a_encapsulation.a_accessmodifiers.b;

import a_encapsulation.a_accessmodifiers.a.A_SameClass;

public class B_ChildClass extends A_SameClass {
	
	/** 1. access them within child class in different package */
	public static void main(String[] args) {
		// create a data object
		A_SameClass data = new A_SameClass();
		
		// print out each variable
//		System.out.println(data.pri); // within the same class
//		System.out.println(data.def); // within the same package
		/*
		 *  Why doesn't pro work? We are working with a parent class object. We need to access the 
		 *  protected property through the child class
		 * */
//		System.out.println(data.pro); // within the same class OR package OR subclass 
		System.out.println(data.pub); // always available
		
		/** 2. example of accessing pro through subclass */
		// within subclass object's scope
		B_ChildClass child = new B_ChildClass();
		System.out.println(child.pro); // direct access to child inherited pro works in subclass
	}
	
	/** 3. example of accessing pro through subclass */
	public void myChildFunc() {	
		// within subclass object's scope
		System.out.println(this.pro); 
	}
}
