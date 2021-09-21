package finalvar;

public class FinalKeywordChild extends FinalKeyword {
	public void changeable() {
		System.out.println("Overridden Within Child!!");
	}

	// error - cannot override final methods
//	public void nonChangeable() {
//		System.out.println("Trying to change!");
//	}
}
