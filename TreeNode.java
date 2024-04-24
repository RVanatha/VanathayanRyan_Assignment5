
public class TreeNode<T> extends Object{

	//Attributes
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;
	private T data;
	
	//Constructors
	public TreeNode(T dataNode) {
		
		leftChild = null;
		rightChild = null;
		data = dataNode;

	}
	
	public TreeNode(TreeNode<T> node) {
		
		this.leftChild = node.leftChild;
		this.rightChild = node.rightChild;
		this.data = node.data;
	}

	//Getters
	public T getData() {
		return data;
	}
	
	public TreeNode<T> getLeftChild(){
		return leftChild;
	}
	
	public TreeNode<T> getRightChild(){
		return rightChild;
	}
	
	//Setters
	public void setData(T d) {
		data = d;
	}
	
	public void setLeftChild(TreeNode<T> left) {
		leftChild = left;
	}
	
	public void setRightChild(TreeNode<T> right) {
		rightChild = right;
	}
	
}