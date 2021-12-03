package polymorphism.methods;

import java.util.ArrayList;

public class Dictionary extends Book{
	
	/*
	 * An ArrayList is a type of data structure, similar to
	 * an Array, but can change in size after it has
	 * been created. In short, this makes it more 
	 * flexible than a standard Array.
	 * 
	 * This would probably be better defined as a Map
	 * which is a type of DataStructure
	 * More on this later...
	 */
	public ArrayList<String> definitions;
	
	public Dictionary(String name, int pageCount) {
		super(name, pageCount);
		definitions = new ArrayList<String>();
	}
	
	public void addDefinition(String content) {
		definitions.add(content);
	}
	
	// Overridden method inherited from the Book class
	public void read() {
		System.out.println("Reading the Dictionary is boring!");
	}
	
	// overloaded method : Multiple methods share the same name, but different parameter list
	public void lookUpWord(String word) {
		System.out.println("A version of the method 'lookUpWord' that might searching using the word Name");
	}
	public void lookUpWord(int index) {
		System.out.println("A version of the method 'lookUpWord' that might searching using the word's index within our list");
	}
}
