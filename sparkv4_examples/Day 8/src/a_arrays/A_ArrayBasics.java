package a_arrays;

public class A_ArrayBasics {
	public static void main(String[] args) {
		/*
		 * Arrays are data structures (structures that hold data)
		 * which are fixed in size. This means, after the array 
		 * has been created we cannot change the number of elements 
		 * that can be placed within the array (the values of those 
		 * elements can be changed)
		 */
		
		/** 1. Create array using 3 methods and explain each one */
		// declare size but not the values of an array
		int[] nums_1 = new int[5];
		
		// declare the values (and in turn the size as well) of an array
		int[] nums_2 = new int[] {6,44,32,99,101}; 
		
		/*
		 * Anonymous array assignment. This allows us to declare
		 * the size and values of the array, without explicitly
		 * stating the array datatype that we are assigning...
		 * 
		 * Note that this only works when we CREATE the array
		 * reference variable, we cannot use anonymous arrays
		 * when we reassign the value later
		 */
		int[] nums_3 = {51,62,73,84,95};
		
		nums_3 = new int[] {1,2,3,4};
//		nums_3 = {5,6,7,8}; // error
		
		/** 2. Explain Array indexes and how they can be used */
		/*
		 * Indexes track the numerical position of data within array
		 * structures. Indexing start with 0.
		 */
		System.out.println(nums_1[0]); // 0
		System.out.println(nums_3[0]); // 1
		nums_3[0] = 15; // 1 -> 15
		System.out.println(nums_3[0]); // 15
	}
}
