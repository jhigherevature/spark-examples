package abstraction;

public class Simulator {
	public static void main(String[] args) {
		Vehicle jet = new AquaticJet();
		jet.steer();
		if (jet instanceof Flyable)
			((Flyable)jet).fly();
		
		if (jet instanceof Aquatic)
			((Aquatic)jet).floatOnWater();
	}
}
