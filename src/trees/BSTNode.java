package trees;

public class BSTNode<T extends Comparable<T>> implements Comparable<BSTNode<T>> {
	private BSTNode<T> left;
	private BSTNode<T> right;
	private T value;
	
	public BSTNode(){
		left = null;
		right = null;
		value = null;
	}
	
	public BSTNode(T inValue){
		left = null;
		right = null;
		this.value = inValue;
	}

	public BSTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	public BSTNode<T> getRight() {
		return right;
	}

	public void setRight(BSTNode<T> right) {
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
