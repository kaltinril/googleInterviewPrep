package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySourceTree<T extends Comparable<T>> {

	BSTNode<T> rootNode;
	
	public BinarySourceTree(BSTNode<T> root){
		this.rootNode = root;
	}
	
	// Since this is a binary tree, we can easily
	// just "search" the tree until we find the insert point
	public void addNode(BSTNode<T> newNode){
		
		System.out.print("," + newNode.getValue().toString());
		
		BSTNode<T> currentNode = rootNode;
		
		while (currentNode != null){			
			if (newNode.compareTo(currentNode) < 0){
				// go left
				if (currentNode.getLeft() == null){
					currentNode.setLeft(newNode);
					currentNode = null;
				}else
					currentNode = currentNode.getLeft();
				
			}else{
				// go right (Including equal)
				if (currentNode.getRight() == null){
					currentNode.setRight(newNode);
					currentNode = null;
				}else
					currentNode = currentNode.getRight();
			}
		}
	}
	
	// Print out elements in Breadth First Search
	public void printBFSQueue(){		
		if (rootNode == null)
			return;
		
		Queue<BSTNode<T>> queue = new LinkedList<BSTNode<T>>();

		queue.add(rootNode);
		while(!queue.isEmpty()){
			BSTNode<T> currentNode = queue.remove();
			
			System.out.print("," + currentNode.getValue().toString());			// print value ("visit")
			
			// add left child to queue
			if (currentNode.getLeft() != null) 
				queue.add(currentNode.getLeft());
			
			// add right child to queue
			if (currentNode.getRight() != null)
				queue.add(currentNode.getRight());
		}
	}
	
	public void printDFSPreOrder(){
		preOrder(rootNode);
	}
	
	public void printDFSInOrder(){
		inOrder(rootNode);
	}
	
	public void printDFSPostOrder(){
		postOrder(rootNode);
	}

	// Middle, Left, Right
	private void preOrder(BSTNode<T> currentNode){
		if (currentNode == null) return;
		
		System.out.print("," + currentNode.getValue().toString());			// print value ("visit")
		preOrder(currentNode.getLeft());								// go left
		preOrder(currentNode.getRight());								// go right
	}
	
	// Left, Middle, Right
	private void inOrder(BSTNode<T> currentNode){
		if (currentNode == null) return;
		
		inOrder(currentNode.getLeft());									// go left
		System.out.print("," + currentNode.getValue().toString());			// print value ("visit")
		inOrder(currentNode.getRight());								// go right
	}
	
	// Left, Right, Middle
	private void postOrder(BSTNode<T> currentNode){
		if (currentNode == null) return;
		
		postOrder(currentNode.getLeft());								// go left
		postOrder(currentNode.getRight());								// go right
		System.out.print("," + currentNode.getValue().toString());			// print value ("visit")
	}
	
}
