package pathFinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// Reference
// https://www.youtube.com/watch?v=T0Qv4-KkAUo&index=26&list=PLFt_AvWsXl0eTHFZ2XPkM6gLK8XdsdzNl

public class AStar {
	
	Grid grid;
	
	public AStar(Grid grid){
		this.grid = grid;
	}
	
	public int getDistance(Node a, Node b){
		int distX = Math.abs(a.gridPosition.getX() - b.gridPosition.getX());
		int distY = Math.abs(a.gridPosition.getY() - b.gridPosition.getY());
		
		// Using 14 this is to allow for diagonal movements
		if (distX > distY)
			return (14 * distY) + (10 * (distX - distY));
		else
			return (14 * distX) + (10 * (distY - distX));
	}
	
	public void findPath(Vector2 startPos, Vector2 targetPos){
		Node startNode = grid.nodeFromPosition(startPos);
		Node targetNode = grid.nodeFromPosition(targetPos);
		
		ArrayList<Node> openSet = new ArrayList<Node>();
		HashSet<Node> closedSet = new HashSet<Node>();
		
		openSet.add(startNode);
		
		while (openSet.size() > 0){
			Node currentNode = openSet.get(0);
			for (int i = 1;i< openSet.size();i++){
				if (openSet.get(i).getFCost() < currentNode.getFCost() ||
						openSet.get(i).getFCost() == currentNode.getFCost() && 
						openSet.get(i).hCost < currentNode.hCost){
					currentNode = openSet.get(i);
				}
			}
			
			openSet.remove(currentNode);
			closedSet.add(currentNode);
			
			// Found the final node!
			if (currentNode == targetNode){
				retracePath(targetNode);
				break;
			}
			
			for(Node neighbor : grid.getNeighbors(currentNode)){
				if (!neighbor.walkable || closedSet.contains(neighbor)){
					continue;
				}
				
				int newMovementCostToNeighbor = currentNode.gCost + getDistance(currentNode, neighbor);
				if (newMovementCostToNeighbor < neighbor.gCost || !openSet.contains(neighbor)){
					neighbor.gCost = newMovementCostToNeighbor;
					neighbor.hCost = getDistance(neighbor, targetNode);
					neighbor.parent = currentNode;
					if (!openSet.contains(neighbor))
						openSet.add(neighbor);
				}
			}
		}
	}
	
	private ArrayList retracePath(Node endNode){
		ArrayList<Node> path = new ArrayList<Node>();
		
		Node currentNode = endNode;
		currentNode.pathStep = true;
		while(currentNode.parent != null){
			path.add(currentNode);
			currentNode = currentNode.parent;
			currentNode.pathStep = true;
		}
		
		Collections.reverse(path);
		return path;
	}
}

