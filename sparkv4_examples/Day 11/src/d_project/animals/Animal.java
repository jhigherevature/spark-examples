package d_project.animals;

/** 1. make base class abstract */
public abstract class Animal {

	protected String name;
	protected String funFact;
	
	public Animal(String name, String funFact) {
		this.name = name;
		this.funFact = funFact;
	}
	
	@Override
	public String toString() {
		return name + " : " + "\nDid You Know?\n" + funFact;
	}


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
