package testClass;


import sortMethods.Quicksort;
import sortMethods.Mergesort;
import hashTables.ArrayOnlyIntHashTable;
import hashTables.ArrayOnlyStringHashTable;
import pathFinding.AStar;
import pathFinding.Grid;
import pathFinding.Vector2;

public class TestClasses {
	public static void main(String[] args) {
		
		System.out.println("Quick Sort!");
		Quicksort qs = new Quicksort();
		int[] values = {87,43,2,3,6,8,16,7,90,6,45,2,25,7,8};
		qs.sort(values);
		
		System.out.println("Merge Sort!");
		Mergesort ms = new Mergesort();
		int[] mergevalues = {87,43,2,3,6,8,16,7,90,6,45,2,25,7,8};
		ms.sort(mergevalues);
		
		System.out.println("Int Hash Table tests!");
		ArrayOnlyIntHashTable intHash = new ArrayOnlyIntHashTable();
		intHash.insert(10, 55);
		intHash.insert(17, 12);
		intHash.insert(106, 66);
		intHash.insert(9955, 9999);
		intHash.insert(245, 2345);
		
		System.out.println(intHash.get(10));
		System.out.println(intHash.get(17));
		System.out.println(intHash.get(106));
		System.out.println(intHash.get(9955));
		System.out.println(intHash.get(245));
		System.out.println(intHash.get(2));
		
		System.out.println("String Hash Table tests!");
		ArrayOnlyStringHashTable hash = new ArrayOnlyStringHashTable();
		hash.insert("first", "my key");
		hash.insert("second", "my second key");
		hash.insert("flint", "my collision key");
		hash.insert("another", "yep");
		
		System.out.println(hash.get("first"));
		System.out.println(hash.get("second"));
		System.out.println(hash.get("flint"));
		System.out.println(hash.get("another"));
		System.out.println(hash.get("does not exist"));
		
		boolean[][] walkable = new boolean[10][10];
		
		for(int x=0; x<10;x++){
			for(int y=0; y<10;y++){
				walkable[x][y] = true;
			}
		}
		
		walkable[2][3] = false;
		walkable[3][3] = false;
		walkable[4][3] = false;
		walkable[4][4] = false;
		walkable[4][5] = false;
		walkable[4][6] = false;
		walkable[4][7] = false;
		
		walkable[5][5] = false;
		
		Grid grid = new Grid(walkable);
		
		grid.print();
		
		AStar astar = new AStar(grid);
		astar.findPath(new Vector2(0,0), new Vector2(8,9));
		grid.print();
		
		System.out.println("Check MSB of Byte");
		int byteValue = -128;
		System.out.println((byteValue >> 7) & 1);
		byteValue = 127;
		System.out.println((byteValue >> 7) & 1);
		byteValue = 128;
		System.out.println((byteValue >> 7) & 1);
	}
}
