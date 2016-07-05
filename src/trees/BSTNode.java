package trees;

public class BSTNode<T extends Comparable<T>> implements Comparable<BSTNode<T>> {
	private BSTNode left;
	private BSTNode right;
	private T value;
	
	public BSTNode(T inValue){
		this.value = inValue;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public int compareTo(BSTNode<T> o) {
		return value.compareTo(o.getValue());
	}
	
	
}
