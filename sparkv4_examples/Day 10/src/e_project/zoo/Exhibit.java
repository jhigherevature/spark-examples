package e_project.zoo;

import java.util.Arrays;

import e_project.animals.Animal;


public class Exhibit {
	
	/** 1. Change access modifiers for fields */
	private String name;
	private String description;
	private Animal[] exhibitAnimals; // will need to change to a collection later
	
	/** 2. add in constructor */
	public Exhibit(String name, String description, Animal[] exhibitAnimals) {
		this.name = name;
		this.description = description;
		this.exhibitAnimals = exhibitAnimals;
	}
	
	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", description=" + description + ", exhibitAnimals=" + Arrays.toString(exhibitAnimals) + "]";
	}
	
	/** 3. Add in getters and setters. Setters optional if fields read-only. */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Animal[] getExhibitAnimals() {
		return exhibitAnimals;
	}

	public void setExhibitAnimals(Animal[] exhibitAnimals) {
		this.exhibitAnimals = exhibitAnimals;
	}

}
