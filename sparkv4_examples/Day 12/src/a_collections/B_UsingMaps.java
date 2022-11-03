package a_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class B_UsingMaps {
	public static void main(String[] args) {
		/** 1. Create and use a map to count letter occurences in a word*/
			System.out.println("================ Counting Letters =================== ");
			HashMap<Character, Integer> map = new HashMap<>();
			
			String word = "banana";
			char[] characters = word.toCharArray();
	
			for (int i = 0; i < word.length(); i++) {
				if (map.containsKey(characters[i])) {
					map.put(characters[i], map.get(characters[i]) + 1);
				} else {
					map.put(characters[i], 1);
				}
				
			
			}
			System.out.println(map);
			
		/** 2. Demonstrate different ways to iterate over a map */
			System.out.println("\n================ iterating =================== ");
			// keyset returns set of keys (used to iterate over a map)
			System.out.println(map.keySet());
			
			// values returns collection values
			System.out.println(map.values());
			
			// entryset returns set of entries (key-value pairs)
			System.out.println(map.entrySet());
		
	}
}
