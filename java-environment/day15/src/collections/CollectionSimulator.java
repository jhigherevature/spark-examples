package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionSimulator {
	public static void main(String[] args) {
		useList();
		useSet();
		useQueue();
	}
	
	public static void useList() {
		System.out.println("::: LISTS :::");
		List<String> alist = new ArrayList<String>();
		alist.add("Assembly");
		alist.add("Binary");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("Compile");
		alist.add("DataStructure");
		alist.add("Functions");
		System.out.println(alist);
		alist.remove(0); // remove an index
		System.out.println(alist);
		alist.remove("Compile"); // remove an element
		System.out.println(alist);
		
		/*
		 * An enhanced for-loop is a looping structure in Java
		 * that allows you to iterate over objects that implement
		 * the Iterable interface at some point in it's inheritance
		 * hierarchy. Since all Collection object inherit from
		 * Iterable, you will be able to use an enhanced for-loop
		 * with any of the Collection Objects.
		 * 
		 * Enhanced For-Loop Syntax:
		 * for (Datatype varName : Collection) {
		 * 		// Loop code
		 * }
		 */
		for (String s : alist) {
			System.out.println(s.toUpperCase());
		}
	}
	
	public static void useSet() {
		System.out.println("::: SETS :::");
		Set<String> hSet = new HashSet<String> ();
		hSet.add("Assembly");
		hSet.add("Binary");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("Compile");
		hSet.add("DataStructure");
		hSet.add("Function");
		System.out.println(hSet);
		hSet.remove("Compile");
		System.out.println(hSet);
	}

	public static void useQueue() {
		System.out.println("::: QUEUES :::");
		Queue<String> lList = new LinkedList<String>();
		System.out.println(lList.poll());	// remove 'head' element
		lList.add("Assembly");
		lList.add("Binary");
		lList.add("Compile");
		lList.add("Compile");
		lList.add("Compile");
		lList.add("DataStructure");
		lList.add("Function");
		System.out.println(lList);
		lList.poll();	// remove 'head' element
		System.out.println(lList);
	}
}
