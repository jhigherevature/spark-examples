package animals;

public class Owner {
	private String name;
	private Pet pet;
	
	public Owner (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void printPetInfo() {
		if (pet != null) {
			System.out.println("Hi, my name is: " + name 
					+ ", and this is my pet: " + pet.getType() 
					+ " named: " + pet.getName());
		}
	}
}
