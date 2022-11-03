package polymorphism.polymorphicreferences;

import polymorphism.methods.Book;
import polymorphism.methods.Comic;
import polymorphism.methods.Dictionary;
import polymorphism.methods.Pamphlet;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * Covariance (a.k.a. covariant typing) allows you to reference a parent class
		 * as if it were a child and vice versa.
		 */

		// Create a parent class reference, using a child class
		Book pamphlet = new Pamphlet("Why you should be a programmer", 1, "Because its so fun!");
		Book dictionary = new Dictionary("Oxford Dictionary 3rd Edition", 1200);
		Book book = new Comic("Marvel Comics", 100);
		
		pamphlet.read();
		dictionary.read();
		
		Book[] bookshelf = new Book[2];
		bookshelf[0] = pamphlet;
		bookshelf[1] = dictionary;

		/*
		 * Here, we are trying to look at the child class functionality despite the fact
		 * that we have a reference variable that is pointing to a Parent class. Here,
		 * we use the cast operation to treat the variable as if it were the child
		 * class.
		 */
		((Dictionary) dictionary).addDefinition("Apple:A red fruit");

		/*
		 * Note, the following also works. This is because Java only checks if the type
		 * we are casting to is a subclass of the variable, not the actual type of the
		 * variable.
		 * 
		 * Since Dictionary is a subclass of the Book class, we are able to cast. This
		 * will, however, result in an error when we actually execute our method,
		 * because the pamphlet object is not a Dictionary.
		 * 
		 * This would be an circumstance where the 'instanceof' operator would be
		 * useful:
		 */
		if (pamphlet instanceof Dictionary) {
			((Dictionary) pamphlet).addDefinition("This won't actually work");
		}

//		((Dictionary)pamphlet).addDefinition("This won't actually work");
	}
}
