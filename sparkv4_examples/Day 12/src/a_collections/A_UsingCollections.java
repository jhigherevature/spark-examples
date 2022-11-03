package a_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Queue;

public class A_UsingCollections {
	public static void main(String[] args) {
		/** 1. create and use an array list */
		System.out.println(" =============== List =============== ");
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			arrli.add(4);
			arrli.add(1);
		    arrli.add(3);
		    arrli.add(5);
		    arrli.add(2);
		    System.out.println(arrli);
		    
		    // you can make use of indexes, other collections would need to use forEach for iteration
		    for (int i = 0; i < arrli.size(); i++) {
		    	System.out.println(arrli.get(i));
		    }
	    
	    /** 2. create and use a set*/
		    System.out.println("\n =============== Set =============== ");
			HashSet<String> hashSet = new HashSet<>();
			hashSet.add("Hello");
			hashSet.add("there");
			hashSet.add("my");
			hashSet.add("name");
			hashSet.add("is");
			hashSet.add("Cynthia");
			hashSet.add("Cynthia"); // we still just have the one "Cynthia"
			System.out.println(hashSet);
	
		/** 3. create and use a queue */
			System.out.println("\n =============== Queue =============== ");
			// arraydeque: has various methods for adding/removing from either end
			Deque<Integer> de_que = new ArrayDeque<Integer>();
			   
		    // can use add() method and remove() like any other Collection
		    de_que.add(1);
		    de_que.add(2);
		    de_que.add(3);
		    de_que.add(4);
		    de_que.add(5);
	    
		 // treated as a queue: first in, first out
		    // if queue is capacity restricted, polling and offering check first before attempting to run
		    System.out.println("after polling:");
		    de_que.poll(); // removes element at head
		    System.out.println(de_que);
		    System.out.println("after offering:");
		    de_que.offer(6); // adds element at tail
		    System.out.println(de_que);
		    System.out.println("peeking:" + de_que.peek()); // head
	    
		    System.out.println("\n =============== Stack =============== ");
		    // treated as a stack: last in, first out
		    de_que.push(1); // adds element at head/top of stack
		    System.out.println("\nafter pushing:");
		    System.out.println(de_que);
		    de_que.pop(); // removes element from head/top of stack
		    System.out.println("after popping:");
		    System.out.println(de_que);
		    System.out.println("Current top: " + de_que.getLast() + "\n");
	    
	    
	    /** 4. optionally demonstrate the Collections class a bit */
		    System.out.println(" =============== Using Collections class =============== ");
			//sort
			Collections.sort(arrli);
			System.out.println(arrli);
			//min
			System.out.println(Collections.min(arrli));
			//max
			System.out.println(Collections.max(arrli));
			//binarySearch
			System.out.println(Collections.binarySearch(arrli, 2));
			//reverse
			Collections.reverse(arrli);
			System.out.println(arrli);
		
	}

}
