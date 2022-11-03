package d_project.animals;

/** 1. Create base class, give some properties for inheritance, override toString() */
public class Animal {

	public String name;
	public String funFact;
	
	@Override
	public String toString() {
		return name + " : " + "\nDid You Know?\n" + funFact;
	}
}
