package petstore.inventory;

public class Food extends Item {
	/*
	 * Since we don't want to change the type of food
	 * (this will either be Dog Food, Cat Food, Fish
	 * Food, Bird Food, etc...
	 * 
	 * We make this variable final.
	 */
	private final String foodType;
	
	public Food (double price, String name, String description, String foodType) {
		super(price, name, description);
		this.foodType = foodType;
	}
	
	public String getFoodType() {
		return this.foodType;
	}
}
