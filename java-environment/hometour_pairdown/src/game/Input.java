package game;

public class Input {
	/*
	 * Method used to gather input from the user, and converts it to 
	 * an array of String objects using a method on the string class
	 * (research the 'split' method for more details) 
	 * 
	 * We convert to an array of String objects so that we can more
	 * easily parse (look at individual units of information) more
	 * easily.
	 */
	public static String[] collectInput() {
		// TODO: Implement method : The split method can create
		// a array of Strings from a single String...
		return null;
	}

	/*
	 * Method used to examine collected input and perform actions
	 */
	public static void parse(String[] command, Player player) {
		/*
		 * 'action' relates to the overall functionality we want to perform this
		 * includes, moving the player, interacting with an object and quitting
		 * 
		 * The 'intern' method is used just to ensure that we are comparing 
		 * Strings in the String pool, with other Strings in the String pool
		 */
		String action = command[0].toUpperCase().intern();

		/*
		 * 'details' refers to additional options for the specific commands. Set to null
		 * initially, because we don't know if the player will enter an additional
		 * command...
		 */
		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		/*
		 * NOTE: The following is simply an example, you are NOT
		 * required to structure your code this way, however, you
		 * may find the following structure to be easier to use
		 * 
		 * Note : In this case 'GO' and 'MOVE' are the same action
		 * and will perform the same logic...To add more logic, you
		 * need more conditions below...
		 */
		if (action == "GO" | action == "MOVE") {
			// What to do when the 'action' specified is to 'move' or 'go'
		} else if (action == "QUIT") {
			Runner.endGame();
		}
	}

	/*
	 * Method used to move the player to a new Room. Note, we can include
	 * this logic directly within the parse method, but encapsulating this
	 * code into a separate method makes the code easier to read, and also
	 * makes the code more maintainable (we can invoke this functionality 
	 * in other locations in our project as well...)
	 */
	public static void movePlayer(String details, Player player) {
		// TODO: Implement method
	}

	/*
	 * Method used to allow the player to interact with objects in a Room
	 * that implement the 'Interactable' interface. Note, we can include
	 * this logic directly within the parse method, but encapsulating this
	 * code into a separate method makes the code easier to read, and also
	 * makes the code more maintainable (we can invoke this functionality 
	 * in other locations in our project as well...)
	 */
	public static void objectInteraction(String details, Player player) {
		// TODO: Implement method
	}
}
