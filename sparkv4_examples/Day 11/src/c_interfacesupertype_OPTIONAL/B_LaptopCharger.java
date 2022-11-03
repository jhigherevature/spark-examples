package c_interfacesupertype_OPTIONAL;

/** 1. Create LaptopCharger: implements connecting to usb port */
public class B_LaptopCharger implements A_Cable {

	@Override
	public void connectToUSB() {
		System.out.println("Connected!");
	}

}
