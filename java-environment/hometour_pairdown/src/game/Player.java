package game;

import fixtures.Room;

/*
 * The Player object simply acts as the way to track the current
 * position of the user in the house. When we move to a new room
 * the 'currentRoom' reference is updated. Additionally, when we
 * want information about the player's current position (such as
 * connecting rooms or what objects are interactable) we use the
 * currentRoom reference.
 */
public class Player {
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
