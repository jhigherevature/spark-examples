package a_strings;

public class B_StringMethods {
	public static void main(String[] args) {
		String word = "Revature";
		
		System.out.println( "Java".charAt(0) );
		
		// charAt() - returns the character at the specified index 
		System.out.println("charAt(3): " + word.charAt(3)); // 4th letter. (Indexing starts at 0)
		
		// indexOf() - returns index for first instance of character or string found within a string
		System.out.println("indexOf('e'): " + word.indexOf('e'));
		
		// length() - returns the count for number of characters in the string
		System.out.println("length(): " + word.length());
		
		// substring() - returns the remainder of a string starting at the index specified
		System.out.println("substring(3): " + word.substring(3));
		
		// equals() - returns true or false after comparing the characters of two strings
		String compare = "ReVaTuRe";
		System.out.println("word.equals(compare): " + word.equals(compare)); // false
		
		// equalsIgnoreCase() - same as equals() method, except we do not care for casing of letters
		System.out.println("equalsIgnoreCase(compare): " + word.equalsIgnoreCase(compare)); // true
		
		// intern() - returns the representation for a String as if it were in the string pool
		String strObj = new String("Revature");
		System.out.println("word == strObj: " + (word == strObj)); // false
		System.out.println("word == strObj.intern(): " + (word == strObj.intern())); // true
		
		// split() - returns an array of Strings using the delimiter provided as an argument to 'slice' strings
		String sentence = "Learning to code is exciting!";
		String[] usingSpace = sentence.split(" "); // the delimiter is spaces between words
		String[] usingE = sentence.split("e"); // the delimiter is the letter 'e'
		
		System.out.println("array elements of split() using a space");
		for (int i = 0; i < usingSpace.length; i++) {
			System.out.println(usingSpace[i]);
		}
		
		System.out.println("array elements of split() using letter e");
		for (int i = 0; i < usingE.length; i++) {
			System.out.println(usingE[i]);
		}
	}
}
