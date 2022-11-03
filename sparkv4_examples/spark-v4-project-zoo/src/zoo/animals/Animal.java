package zoo.animals;

public abstract class Animal {
	protected String name;
	protected String funFact;
	
	public Animal(String name, String funFact) {
		this.name = name;
		this.funFact = funFact;
	}

	public String getName() {
		return name;
	}
	public String getFunFact() {
		return funFact;
	}
	
	public String toString() {
		return name + " : " + "\nDid You Know?\n" + funFact;
	}
}
