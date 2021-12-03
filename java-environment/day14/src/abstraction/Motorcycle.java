package abstraction;

public class Motorcycle extends Vehicle {

	@Override
	public void propel() {
		System.out.println("Use the accelerator on the left handle");
	}

	@Override
	public void steer() {
		System.out.println("Somewhat similar to a bicycle");
	}
	
}
