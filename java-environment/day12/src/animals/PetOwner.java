package animals;

public class PetOwner {
	/*
	 * Aside from inheritance relationships, you can establish
	 * "composite" relationships. These are relationships wherein
	 * one object points to a reference to another object.
	 * 
	 * The terms "IS-A" and "HAS-A" are used to identify inheritance
	 * and composite relationships in your code. An "IS-A" relationship
	 * relates to inheritance, whereas "HAS-A" relates to composition.
	 * 
	 * In this case, with composite relationships, we are saying
	 * "PetOwners HAVE-A name"
	 * and
	 * "PetOwners HAVE-A pet"
	 */
	public String name;
	public Animal pet;
	
	/*
	 * Getter and Setter methods (a.k.a. accessor and 
	 * mutator methods) are commonly used when communicating
	 * between classes...More on this soon
	 */
	public void setPet(Animal pet) {
		this.pet = pet;
	}
}
