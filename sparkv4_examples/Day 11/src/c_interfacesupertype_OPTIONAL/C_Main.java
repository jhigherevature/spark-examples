package c_interfacesupertype_OPTIONAL;

public class C_Main {
	public static void main(String[] args) {
		/** 1. create a Cable reference variable, assign it a LaptopCharger object**/
		// mention that interface is supertype, so we're doing object casting
		A_Cable myCable = new B_LaptopCharger();
		
		// check if it plugs into a USB port
		myCable.connectToUSB();
		
		/** 1.  re-assign it a Microphone object **/
		myCable = new B_Microphone();
		
		// check if it plugs into a USB port
		myCable.connectToUSB();
	}
}
