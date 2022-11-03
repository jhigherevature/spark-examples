package c_interfacesupertype_OPTIONAL;

/** 1. Create Microphone: implements connecting to usb port */
public class B_Microphone implements A_Cable {
	@Override
	public void connectToUSB() {
		System.out.println("Connected!");
	}
}
