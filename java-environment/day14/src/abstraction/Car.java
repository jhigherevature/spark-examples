package abstraction;

public class Car extends Vehicle {
	public void propel() {
		System.out.println("Press down on the accelerator to go faster!");
	}

	public void steer() {
		System.out.println("Use the wheel to turn left and right");
	}
}
