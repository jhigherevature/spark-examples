package a_arrays;

public class B_ArrayIteration {
	public static void main(String[] args) {
		/** 1. Explain length and length-1 for last index. And accessing values from Array */
		/*
		 * Arrays have various properties associated with them. 
		 * One of which is the length, which is informative of
		 * the number of elements within the array.
		 * 
		 * Since counting the length starts at 1 and indexing 
		 * starts at 0, this means the last index or any array 
		 * will always be one less than the length of that array.
		 */
		int[] nums = {99,44,66,33,22,77};
		System.out.println( nums.length ); // 6
		System.out.println( nums[0] ); // 99
		System.out.println( nums[1] ); // 44
		System.out.println( nums[2] ); // 66
		System.out.println( nums[3] ); // 33
		System.out.println( nums[4] ); // 22
		System.out.println( nums[5] ); // 77
		System.out.println( nums[ nums.length - 1 ] ); // 77 : nums.length - 1 is 5
		

		/** 2. Create and explain loops below. Showcase while loops, then for-loops and compare to enhanced for-loop */
		/*
		 * Printing each value of the array, as we did above is only
		 * useful when you know exactly what size the array is. This
		 * won't be the case if you are receiving input from a user or
		 * some other location. Instead, we can use loops to access 
		 * the elements of an array for us
		 */
		System.out.println("While loop: ");
		int index = 0;
		while (index < nums.length) {
			System.out.println(nums[index]);
			index++;
		}
		
		System.out.println("For loop: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Enhanced for-loop: ");
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
