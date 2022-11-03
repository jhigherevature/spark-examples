package e_project.zoo;

import java.util.ArrayList;

import e_project.animals.Animal;
import e_project.animals.Bird;
import e_project.animals.Mammal;
import e_project.animals.Reptile;

public class Zoo {
	
	private Exhibit[] exhibits; // may refactor to collection
	
	/* initialize zoo through either constructor or method: 
	 *  - create animals
	 *  - create exhibits
	 *  - update zoo's exhibits property
	 * 
	 * */
	
	/** 3. getters and setters. Setter optional. */
	public Exhibit[] getExhibits() {
		return exhibits;
	}

	public void setExhibits(Exhibit[] exhibits) {
		this.exhibits = exhibits;
	}
}
