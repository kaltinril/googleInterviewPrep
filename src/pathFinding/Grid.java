package pathFinding;

import java.util.ArrayList;

public class Grid {
	
	public Vector2 gridWorldSize;
	public float nodeRadius;
	private Node[][] grid;
	
	float nodeDiameter;
	int gridSizeX, gridSizeY;
	
	// nodes passed in is 
	public Grid(boolean[][] walkableNodes){
		gridWorldSize = new Vector2(walkableNodes.length, walkableNodes.length);
		CreateGrid(walkableNodes);
	}
	
	private void CreateGrid(boolean[][] walkableNodes){
		grid = new Node[gridWorldSize.getX()][gridWorldSize.getY()];
		
		for (int x = 0; x < gridWorldSize.getX(); x++){
			for (int y = 0; y < gridWorldSize.getY(); y++){	
				grid[x][y] = new Node(walkableNodes[x][y], new Vector2(x,y));
			}
		}
	}
	
	public Node nodeFromPosition(Vector2 position){
		return grid[position.getX()][position.getY()];
	}
	
	public ArrayList<Node> getNeighbors(Node node){
		ArrayList<Node> neighbors = new ArrayList<Node>();
		
		int minLeft = Math.max(node.gridPosition.getX() - 1, 0);
		int minTop = Math.max(node.gridPosition.getY() - 1, 0);
		int maxRight = Math.min(node.gridPosition.getX() + 1, gridWorldSize.getX());
		int maxBottom = Math.min(node.gridPosition.getY() + 1, gridWorldSize.getY());
		
		
		for(int x=minLeft;x<=maxRight;x++){
			for(int y=minTop;y<=maxBottom;y++){
				if (x == 0 && y == 0)
					continue;
				
				neighbors.add(grid[x][y]);
			}
		}
		
		return neighbors;
	}
	
	// The graphics output
	public void draw(){
		
	}
	
	// Lazy to create a graphics output
	public void print(){
		for(int x=0;x<gridWorldSize.getX();x++){
			for(int y=0;y<gridWorldSize.getY();y++)
				System.out.print(grid[x][y].toString());
			
			System.out.println();
		}
		System.out.println();
	}
}
