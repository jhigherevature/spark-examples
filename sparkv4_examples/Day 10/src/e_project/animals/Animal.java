package e_project.animals;

public class Animal {

	/** 1. change access modifiers for fields */
	protected String name;
	protected String funFact;
	
	/** 2. Add in a constructor */
	public Animal(String name, String funFact) {
		this.name = name;
		this.funFact = funFact;
	}
	
	@Override
	public String toString() {
		return name + " : " + "\nDid You Know?\n" + funFact;
	}


	/** 3. Getters and setters added (setters optional. You could make the fields read-only. */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunFact() {
		return funFact;
	}

	public void setFunFact(String funFact) {
		this.funFact = funFact;
	}
	
}
