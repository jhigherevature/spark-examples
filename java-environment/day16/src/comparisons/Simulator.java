package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Note that the Arrays class mentioned below is a class 
 * in the JRE and NOT specifically a reference to an Array Object.
 * 
 * The Arrays class is a utility class (similar to the Collections
 * class) which exists in the java.util package of the JRE and 
 * provides functionality that can be used with Array Objects. This 
 * allows  you to print Array objects to the console instead of 
 * printing hashcode (Arrays.toString(array)), or the ability to 
 * sort an array object based on the Comparable interface 
 * implementation for the objects being sorted (Arrays.sort(array));
 */
public class Simulator {
	public static void main(String[] args) {
		Data d1 = new Data(1, 6.7);
		Data d2 = new Data(7, 99.3);
		Data d3 = new Data(101, 45.1);
		Data d4 = new Data(34, 18.2);
		Data d5 = new Data(66, 2.1);
		
		Data[] datas = {d1, d2, d3, d4, d5};
		System.out.println("INITIAL ARRAY:");
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(datas));
		
		ArrayList<Data> dList = new ArrayList<Data>();
		dList.add(d1);
		dList.add(d2);
		dList.add(d3);
		dList.add(d4);
		dList.add(d5);
		System.out.println("INITIAL ARRAY LIST:");
		System.out.println(dList);
		Collections.sort(dList, new IdComparator());
		System.out.println("SORTED BY ID");
		System.out.println(dList);
		System.out.println("SORTED BY AMOUNT");
		Collections.sort(dList, new AmountComparator());
		System.out.println(dList);
	}
}
