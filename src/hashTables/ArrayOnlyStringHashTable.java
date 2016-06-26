package hashTables;

public class ArrayOnlyStringHashTable {
	private final static int TABLE_SIZE = 256;
	
	private String keys[];
	private String values[];
	
	public ArrayOnlyStringHashTable() {
		keys = new String[TABLE_SIZE];
		values = new String[TABLE_SIZE];
	}
	
	private int generateKeyInteger(String key){
		char firstCharacter = key.charAt(0);
		char lastCharacter = key.charAt(key.length()-1);
		
		// Use the first character, last character, and length for the key index
		return ((int)firstCharacter) + ((int)lastCharacter) + key.length();
	}
	
	public int findHashPosition(String key){
		int keyInt = generateKeyInteger(key);
		
		int startKeyPosition = (keyInt % TABLE_SIZE);
		int keyPosition = startKeyPosition;
		
		// Rotate over the key positions until we find an empty one
		while (keys[keyPosition] != null && !keys[keyPosition].equals(key)){
			keyPosition++;
			keyPosition = keyPosition % TABLE_SIZE;			// Rotate around
			
			if (keyPosition == startKeyPosition)			// We looked over the entire table, there is no space left
				return -1;									// Here is where we could potentially expand the table
		}
		
		return keyPosition;
	}
	
	// Returns the index of the inserted item
	public void insert(String key, String value){
		int keyPosition = findHashPosition(key);
		
		keys[keyPosition] = key;
		values[keyPosition] = value;
	}
	
	public String get(String key){
		int keyPosition = findHashPosition(key);
		
		if (keyPosition == -1)
			return null;
		else
			return values[keyPosition];
	}
	
	// There is no way to get the value other than searching each item
	public String findKeyFromValue(String valueToFind){
		for(int i = 0; i < TABLE_SIZE; i++){
			if (values[i].equals(valueToFind))
				return keys[i];								// Return the key
		}
		
		return null;
	}
	
	public boolean keyExists(String key){
		int keyPosition = findHashPosition(key);
		
		if (keyPosition == -1)
			return false;
		else
			return true;
	}
	
	public boolean valueExists(String valueToCheck){
		for(int i = 0; i < TABLE_SIZE; i++){
			if (values[i].equals(valueToCheck))
				return true;
		}
		
		return false;
	}
}
