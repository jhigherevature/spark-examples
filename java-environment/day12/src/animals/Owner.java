package animals;

public class Owner {
	public String name;
	public Animal pet;
	
	/*
	 * Getter and Setter methods (a.k.a. accessor and 
	 * mutator methods) are commonly used when communicating
	 * between classes... 
	 */
	public void setPet(Animal pet) {
		this.pet = pet;
	}
}
