package polymorphism.methods;

public class Pamphlet extends Book {
	public String content;
	
	public Pamphlet (String name, int pageCount, String content) {
		super(name, pageCount);
		this.content = content;
	}
	
	public void read() {
		System.out.println(content);
	}
}
