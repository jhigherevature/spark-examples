package b_variables;

public class PrimitiveVsReference {
	/** 1. Explain difference between stack and heap memory */
	public static void main(String[] args) {
		/** 2. Create primitives and explain '==' with stack */
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		
		/** 3. Create objects and explain '==' with heap. */
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		
		/** 4. Introduce 'toString' and Hashcode for Objects. "take this with a grain of salt" */
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}
