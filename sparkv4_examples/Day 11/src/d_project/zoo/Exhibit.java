package d_project.zoo;

import java.util.Arrays;

import d_project.animals.Animal;


public class Exhibit {
	
	private String name;
	private String description;
	private Animal[] exhibitAnimals; // will need to change to a collection later
	
	public Exhibit(String name, String description, Animal[] exhibitAnimals) {
		this.name = name;
		this.description = description;
		this.exhibitAnimals = exhibitAnimals;
	}
	
	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", description=" + description + ", exhibitAnimals=" + Arrays.toString(exhibitAnimals) + "]";
	}
	
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
