package a_operators;

public class B_LogicalOperators {
	public static void main(String[] args) {
		/** 1. explain logical operators: */
			// &&
			System.out.println(true && true); // true
			System.out.println(true && false); // false
			System.out.println(false && false); // false
			
			// ||
			System.out.println(true || true); // true
			System.out.println(true || false); // true
			System.out.println(false && false); // false
			
			// !
			System.out.println(!true); // false
			System.out.println(!false); // true
		
		/** 2. Using boolean logic to make decisions: */
			System.out.println(3 < 4 && 5 > 10); // false
			System.out.println(5 > 10 || 3 < 4); // true
	
			boolean isRaining = false;
			boolean hasMoney = true;
		
			// If it isn't raining and if I have money, I'm going shopping!
			System.out.println(!isRaining && hasMoney); // true
		
	}
}
