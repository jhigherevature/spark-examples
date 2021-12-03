package polymorphism.methods;

/*
 * Superclass for the Pamphlet and Dictionary classes
 */
public class Book {
	protected String name;
	protected int pageCount;
	
	public Book(String name, int pageCount) {
		this.name = name;
		this.pageCount = pageCount;
	}
	
	public void read() {
		System.out.println("Generic Book class read method");
	}
}
