package erik.mcmaster.ds.tree;

public class TreeNode {
	
	private int value;
	private TreeNode leftChildNode;
	private TreeNode rightChildNode;
	
	public TreeNode(int thevalue) {
		// TODO Auto-generated constructor stub
		value = thevalue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftChildNode() {
		return leftChildNode;
	}

	public void setLeftChildNode(TreeNode leftChildNode) {
		this.leftChildNode = leftChildNode;
	}

	public TreeNode getRightChildNode() {
		return rightChildNode;
	}

	public void setRightChildNode(TreeNode rightChildNode) {
		this.rightChildNode = rightChildNode;
	}

}
