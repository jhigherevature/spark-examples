package petstore.inventory;

import petstore.animals.Animal;
import petstore.animals.Cat;
import petstore.animals.Dog;
import petstore.animals.Fish;
import petstore.animals.Rabbit;

public class InventoryManager {
	private Animal[] animals;
	private Item[] food;
	private Item[] toys;
	
	/*
	 * This method is used to create the inventory
	 * for our pet store.
	 * 
	 * In an actual application, this type of functionality
	 * would typically be handled by a database which
	 * contains a record of inventory items. Possibly
	 * uploaded from an excel sheet or some other 
	 * data source. Here, we are manually creating items 
	 * since we are not connecting to a database.
	 */
	public void init() {
		animals = new Animal[4];
		food = new Item[4];
		toys = new Item[2];
		/*
		 * Note that we can add items to an Array directly
		 * like the following:
		 */
		animals[0] = new Cat("Ceaser", 2, "Calico");  
		animals[1] = new Dog("Doug", 3, "Golden Retriever");
		animals[2] = new Fish("Franklin", 1, "Goldfish", true);
		animals[3] = new Rabbit("Roger", 2);
		
		/*
		 * Alternatively, we can create variables to store the
		 * object reference, then pass it into the array later.
		 * This second method is slightly less efficient, but
		 * you should be able to understanding either approach
		 */
		Food dogFood = new Food(25.00, "Pup Chow", "Chicken Flavored Dog Food", "Dog Food");
		Food catFood = new Food(20.00, "Kitty Chow", "Salmon Flavored Cat Food", "Cat Food");
		Food fishFood = new Food(5.00, "Nemo Nibbles", "Saltwater Fish flakes", "Fish Food");
		Food rabbitFood = new Food(10.00, "Buggs Bites", "Grassy Straw Rabbit Food", "Rabbit Food");
		
		Toy frisbee = new Toy(10.00, "Frisbee", "A brightly colored Frisbee");
		Toy ball = new Toy(5.00, "Squeakes-a-lot", "A squeaky ball");
		
		food[0] = dogFood;
		food[1] = catFood;
		food[2] = fishFood;
		food[3] = rabbitFood;
		
		toys[0] = frisbee;
		toys[1] = ball;
	}
	
	public Animal[] getAnimals() {
		return animals;
	}
	public Item[] getFood() {
		return food;
	}
	public Item[] getToys() {
		return toys;
	}
	
	public Animal pickAnimal(int index) {
		if (index > animals.length)
			return null;
		
		return animals[index];
	}
	
	public Item pickFood(int index) {
		if (index > food.length)
			return null;
		
		return food[index];
	}
	
	public Item pickToy(int index) {
		if (index > toys.length)
			return null;
		
		return toys[index];
	}
}
