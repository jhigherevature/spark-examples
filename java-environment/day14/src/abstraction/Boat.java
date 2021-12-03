package abstraction;

/*
 * When inheriting from the same entity categories (i.e. class inherit from class,
 * or interface inheriting from interfaces), classes can only extend one
 * other class!
 * 
 * However, classes may implement many interfaces
 */
public class Boat extends Vehicle implements Aquatic {
	public void propel() {
		System.out.println("Propulsion controller by a rudder under-water");
	}

	public void steer() {
		System.out.println("Steering is controlled by the helm");
	}

	@Override
	public void floatOnWater() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sink() {
		// TODO Auto-generated method stub
		
	}

}
