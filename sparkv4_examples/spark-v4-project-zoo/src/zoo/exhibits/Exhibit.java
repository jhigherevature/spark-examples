package zoo.exhibits;

import java.util.List;

import zoo.animals.Animal;

public class Exhibit {
	private String name;
	private String description;
	List<Animal> exhibitAnimals;
	
	public Exhibit(String name, String description, List<Animal> exhibitAnimals) {
		this.name = name;
		this.description = description;
		this.exhibitAnimals = exhibitAnimals;
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public List<Animal> getExhibitAnimals() {
		return exhibitAnimals;
	}

	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", description=" + description + ", exhibitAnimals=" + exhibitAnimals + "]";
	}
}
