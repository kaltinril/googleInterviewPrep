package junit;

import static org.junit.Assert.*;
import hashTables.ArrayOnlyIntHashTable;

import org.junit.Test;

public class ArrayOnlyIntHashTableTest {
	
	@Test
	public void testNoCollision(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyIntHashTable intHash = new ArrayOnlyIntHashTable();
		int key = 10;
		int value = 55;
		intHash.insert(key, value);
		
		assertEquals(intHash.get(key), value);
	}
	
	@Test
	public void testSingleCollision(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyIntHashTable intHash = new ArrayOnlyIntHashTable();
		intHash.insert(10, 120);
		int key = 266;
		int value = 55;
		intHash.insert(key, value);
		
		assertEquals(intHash.get(key), value);
	}
	
	@Test
	public void testSingleCollisionPosition(){
		System.out.println("Int Hash Table tests!");
		ArrayOnlyIntHashTable intHash = new ArrayOnlyIntHashTable();
		intHash.insert(10, 120);
		int originalPosition = intHash.getArrayPositionFromKey(10);
		intHash.insert(266, 55);
		int secondPosition = intHash.getArrayPositionFromKey(266);
		
		assertNotEquals(originalPosition, secondPosition);
	}
}
