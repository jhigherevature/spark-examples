package d_project.zoo;

import java.util.Arrays;

import d_project.animals.Animal;

/** 1. add in toString and array */
public class Exhibit {
	
	// properties
	public String name;
	public String description;
	public Animal[] exhibitAnimals; // will need to change to a collection later
	
	@Override
	public String toString() {
		return "Exhibit [name=" + name + ", description=" + description + ", exhibitAnimals=" + Arrays.toString(exhibitAnimals) + "]";
	}
}
