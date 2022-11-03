package c_thiskeyword;

public class B_Main {

	public static void main(String[] args) {
		/** 1. Create Item object and explain 'this' changing instance variable values */		
		// Since we created a constructor we do not have a default constructor given to us
		A_Item item = new A_Item("Programming Book", 99.99);
		System.out.println(item.getName()); // "Programming Book"
		System.out.println(item.getPrice()); // 99.99
		item.setPrice(49.99);
		System.out.println(item.getPrice()); // 49.99
	}
}
