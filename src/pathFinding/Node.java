package pathFinding;

public class Node {
	public boolean walkable;
	public Vector2 gridPosition;
	
	public int gCost;
	public int hCost;
	public Node parent;
	public boolean pathStep;
	
	public Node(boolean inWalkable, Vector2 inGridPosition){
		this.walkable = inWalkable;
		this.gridPosition = inGridPosition;
	}
	
	public int getFCost(){
		return gCost + hCost;
	}
	
	public String toString(){

//		if (walkable){
//			if (pathStep)
//				return "======";
//			else
//				return String.format("%6d", getFCost());
//		}
//		else{
//			return "|####|";
//		}
		
		return (walkable) ? (pathStep) ? " ====" : String.format("%5d", getFCost()) : " |##|";
	}
	
}
