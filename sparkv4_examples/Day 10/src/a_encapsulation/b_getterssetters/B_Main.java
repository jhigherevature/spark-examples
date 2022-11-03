package a_encapsulation.b_getterssetters;

/** 1. Use getters and setters */
public class B_Main {
	public static void main(String[] args) {
		A_Cat cat = new A_Cat();
		
		cat.setName("");
		System.out.println(cat.getName());
		
		cat.setAge(5);
		System.out.println(cat.getAge());
	}
}
