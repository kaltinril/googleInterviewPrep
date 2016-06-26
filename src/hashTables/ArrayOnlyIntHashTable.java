package hashTables;

public class ArrayOnlyIntHashTable {
	private final static int TABLE_SIZE = 256;
	
	private int keys[];
	private int values[];
	
	public ArrayOnlyIntHashTable() {
		keys = new int[TABLE_SIZE];
		values = new int[TABLE_SIZE];
	}
	
	public int getArrayPositionFromKey(int key){
		int startKeyPosition = (key % TABLE_SIZE);
		int keyPosition = startKeyPosition;
		
		while (keys[keyPosition] != key){
			keyPosition++;
			keyPosition = keyPosition % TABLE_SIZE;			// Rotate around
			
			if (keyPosition == startKeyPosition)			// We looked over the entire table, the key was not found
				return -1;									// 0 is our indication of null, could have error instead or convert to an object
		}
		
		return keyPosition;
	}
	
	// Returns the index of the inserted item
	public void insert(int key, int value){
		int startKeyPosition = (key % TABLE_SIZE);
		int keyPosition = startKeyPosition;
		
		// Rotate over the key positions
		while (keys[keyPosition] != 0 && values[keyPosition] != 0){
			keyPosition++;
			keyPosition = keyPosition % TABLE_SIZE;			// Rotate around
			
			if (keyPosition == startKeyPosition)			// We looked over the entire table, there is no space left
				return;										// Here is where we could potentially expand the table
		}
		
		keys[keyPosition] = key;
		values[keyPosition] = value;
	}
	
	public int get(int key){
		int startKeyPosition = (key % TABLE_SIZE);
		int keyPosition = startKeyPosition;
		
		while (keys[keyPosition] != key){
			keyPosition++;
			keyPosition = keyPosition % TABLE_SIZE;			// Rotate around
			
			if (keyPosition == startKeyPosition)			// We looked over the entire table, the key was not found
				return 0;									// 0 is our indication of null, could have error instead or convert to an object
		}
		
		return values[keyPosition];
	}
	
	// There is no way to get the value other than searching each item
	public int findKeyFromValue(int valueToFind){
		for(int i = 0; i < TABLE_SIZE; i++){
			if (values[i] == valueToFind)
				return keys[i];								// Return the key
		}
		
		return 0;											// Preferably return error or change to an object to return null
	}
	
	public boolean keyExists(int key){
		int startKeyPosition = (key % TABLE_SIZE);
		int keyPosition = startKeyPosition;
		
		while (keys[keyPosition] != key){
			keyPosition++;
			keyPosition = keyPosition % TABLE_SIZE;			// Rotate around
			
			if (keyPosition == startKeyPosition)			// We looked over the entire table, the key was not found
				return false;								// no key found
		}
		
		return true;
	}
	
	public boolean valueExists(int valueToCheck){
		for(int i = 0; i < TABLE_SIZE; i++){
			if (values[i] == valueToCheck)
				return true;
		}
		
		return false;
	}
}
