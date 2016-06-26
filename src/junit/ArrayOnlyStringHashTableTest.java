package junit;

import static org.junit.Assert.*;
import hashTables.ArrayOnlyStringHashTable;

import org.junit.Test;

public class ArrayOnlyStringHashTableTest {
	
	@Test
	public void testNoCollision(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyStringHashTable hash = new ArrayOnlyStringHashTable();
		String key = "first";
		String value = "my value";
		hash.insert(key, value);
		
		assertEquals(hash.get(key), value);
	}
	
	@Test
	public void testSingleCollision(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyStringHashTable hash = new ArrayOnlyStringHashTable();
		hash.insert("first", "my value");
		String key = "flint";
		String value = "alternate value";
		hash.insert(key, value);
		
		assertEquals(hash.get(key), value);
	}
	
	@Test
	public void testSingleCollisionPosition(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyStringHashTable hash = new ArrayOnlyStringHashTable();
		hash.insert("first", "my value");
		int originalPosition = hash.findHashPosition("first");
		hash.insert("flint", "alternate value");
		int secondPosition = hash.findHashPosition("flint");
		
		assertNotEquals(originalPosition, secondPosition);
	}
}
