package trees;

public class BinarySourceTree {

	BSTNode rootNode;
	
	public BinarySourceTree(BSTNode root){
		this.rootNode = root;
	}
	
	// Since this is a binary tree, we can easily
	// just "search" the tree until we find the insert point
	public void addNode(BSTNode newNode){
		
		BSTNode currentNode = rootNode;
		
		while (currentNode != null){
			if (newNode.compareTo(currentNode) < 0){
				// go left
				if (currentNode.getLeft() == null)
					currentNode.setLeft(newNode);
	
				currentNode = currentNode.getLeft();
			}else{
				// go right (Including equal)
				if (currentNode.getRight() == null)
					currentNode.setRight(newNode);
				
				currentNode = currentNode.getRight();
			}
		}
	}
	
	// Print out elements in Breadth First Search
	public void printBFSQueue(){
		
		// print value
		// add left child to queue
		// add right child to queue
		
	}
	
	public void printDFSPreOrder(){
		preOrder(rootNode);
	}
	
	// Middle, Left, Right
	private void preOrder(BSTNode currentNode){
		if (currentNode == null) return;
		
		System.out.println(currentNode.getValue().toString());			// print value ("visit")
		preOrder(currentNode.getLeft());								// go left
		preOrder(currentNode.getRight());								// go right
	}
	
	public void printDFSInOrder(){
		inOrder(rootNode);
	}
	
	// Left, Middle, Right
	private void inOrder(BSTNode currentNode){
		if (currentNode == null) return;
		
		inOrder(currentNode.getLeft());									// go left
		System.out.println(currentNode.getValue().toString());			// print value ("visit")
		inOrder(currentNode.getRight());								// go right
	}
	
	public void printDFSPostOrder(){
		postOrder(rootNode);
	}
	
	// Left, Right, Middle
	private void postOrder(BSTNode currentNode){
		if (currentNode == null) return;
		
		postOrder(currentNode.getLeft());								// go left
		postOrder(currentNode.getRight());								// go right
		System.out.println(currentNode.getValue().toString());			// print value ("visit")
	}
	
}
