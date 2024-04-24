import java.util.ArrayList;

public class MorseCodeTree implements LinkedConverterTreeInterface<String> {
	//Attributes
	private TreeNode<String> treeRoot;

	//Constructor
	public MorseCodeTree() {
		treeRoot = new TreeNode<String>("");	
		buildTree();
	}

	//Getter
	@Override
	public TreeNode<String> getRoot() {
		return treeRoot;
	}

	//Setter
	@Override
	public void setRoot(TreeNode<String> newNode) {
		treeRoot = newNode;
	}

	//Methods
	@Override
	public void insert(String code, String result) {
		addNode(treeRoot, code, result);
	}

	

	@Override
	public ArrayList<String> toArrayList() {
		ArrayList<String> newArrayList = new ArrayList<String>();
		
		LNRoutputTraversal(treeRoot, newArrayList);
		
		return newArrayList;
		
	}
	
	@Override
	public void buildTree() {
		insert(".", "e");
		insert("-", "t");
		insert("..", "i");
		insert(".-", "a");
		insert("-.", "n");
		insert("--", "m");
		insert("...", "s");
		insert("..-", "u");
		insert(".-.", "r");
		insert(".--", "w");
		insert("-..", "d");
		insert("-.-", "k");
		insert("--.", "g");
		insert("---", "o");
		insert("....", "h");
		insert("...-", "v");
		insert("..-.", "f");
		insert(".-..", "l");
		insert(".--.", "p");
		insert(".---", "j");
		insert("-...", "b");
		insert("-..-", "x");
		insert("-.-.", "c");
		insert("-.--", "y");
		insert("--..", "z");
		insert("--.-", "q");
	}
	
	
	@Override
	public String fetch(String code) {
		return fetchNode(treeRoot, code);
	}

	@Override
	public String fetchNode(TreeNode<String> root, String code) {
		
		if (code.length() == 1) {
			
	
			if (code.charAt(0) == '.') 
				return root.getLeftChild().getData();
			
			else 
				return root.getRightChild().getData();
			
		} 
		
		else {
			if (code.charAt(0) != '.') 
				return fetchNode(root.getRightChild(), code.substring(1));
			
			else 
				return fetchNode(root.getLeftChild(), code.substring(1));		
		}
		
	}

	@Override
	public LinkedConverterTreeInterface<String> update() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public LinkedConverterTreeInterface<String> delete(String data) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}


	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {
		if (code.length() == 1) {
			if (code.charAt(0) == '.')
				root.setLeftChild(new TreeNode<String>(letter));
			
			else if (code.equals("-"))
				root.setRightChild(new TreeNode<String>(letter));		
		} 
		else {
			if (code.charAt(0) == '.')
				addNode(root.getLeftChild(), code.substring(1), letter);
			
			else if (code.charAt(0) == '-') 
				addNode(root.getRightChild(), code.substring(1), letter);		
		}
	}

	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		
		if (root != null) {
			
			LNRoutputTraversal(root.getLeftChild(), list);
			
			list.add(root.getData());
			
			LNRoutputTraversal(root.getRightChild(), list);	
		} 
		else 
			return;
	}

}