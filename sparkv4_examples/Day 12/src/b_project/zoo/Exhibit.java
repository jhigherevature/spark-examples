package b_project.zoo;

import java.util.List;

import b_project.animals.Animal;

/** 1. Change array to List */
public class Exhibit {
	
	private String name;
	private String description;
	private List<Animal> exhibitAnimals;
	
	public Exhibit(String name, String description, List<Animal> exhibitAnimals) {
		this.name = name;
		this.description = description;
		this.exhibitAnimals = exhibitAnimals;
	}
	
	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", description=" + description + ", exhibitAnimals=" + exhibitAnimals + "]";
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

	public List<Animal> getExhibitAnimals() {
		return exhibitAnimals;
	}

	public void setExhibitAnimals(List<Animal> exhibitAnimals) {
		this.exhibitAnimals = exhibitAnimals;
	}

}
