package erik.mcmaster.ds.tree;

public class MyBinarySearchTreeImpl implements MyBinarySearchTree{

	int[] thevalues = {423,323,423,333,2243,5423,123,543,234,123};
	public TreeNode rootnode = new TreeNode(thevalues[0]);
	int count = 0;
	
	public TreeNode getRootnode() {
		return rootnode;
	}
	public void setRootnode(TreeNode rootnode) {
		this.rootnode = rootnode;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public MyBinarySearchTreeImpl() {
		// TODO Auto-generated constructor stub
	}
	public boolean addNode(TreeNode thenode, TreeNode therootnode){
		if (thenode.getValue() == therootnode.getValue()){
			return false;
		}else{
			if (thenode.getValue() < therootnode.getValue()){
				if(therootnode.getLeftChildNode() !=  null){
					addNode(thenode, therootnode.getLeftChildNode());	
				}else{
					therootnode.setLeftChildNode(thenode);
					showMessage("Node "+thenode.getValue()+" was added to root "+therootnode.getValue()+" left child");
					return true;
				}
			}else{
				if(therootnode.getRightChildNode() !=  null){
					addNode(thenode, therootnode.getRightChildNode());
				}else{
					therootnode.setRightChildNode(thenode);
					showMessage("Node "+thenode.getValue()+" was added to root "+therootnode.getValue()+" right child");
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean findNode(int value, TreeNode therootnode) {
		// TODO Auto-generated method stub
		if(value == therootnode.getValue()){
			showMessage(++count+" -> Found "+value+" at node "+therootnode.getValue());
			return true;
		}else{
			if (value < therootnode.getValue()){
				if(therootnode.getLeftChildNode() == null){
					showMessage("Can't find this value");
					return false;
				}else{
					showMessage(++count+" -> Value "+ value+" is less than node value "+therootnode.getValue()+" , go to left child "+therootnode.getLeftChildNode().getValue());
					findNode(value, therootnode.getLeftChildNode());	
				}
			}else{
				if(therootnode.getRightChildNode() == null){
					showMessage("Can't find this value");
					return false;
				}else{
					showMessage(++count+" -> Value "+ value+" is greater than node value "+therootnode.getValue()+" , go to right child "+therootnode.getRightChildNode().getValue());
					findNode(value, therootnode.getRightChildNode());
				}
			}
		}
		
		
		return false;
	}
	@Override
	public boolean createTree() {
		// TODO Auto-generated method stub
		showMessage("Root node "+rootnode.getValue()+" was added to tree as root");
		for (int t=1; t<thevalues.length;t++){
			TreeNode childNode = new TreeNode(thevalues[t]);
			addNode(childNode,rootnode);
		}
		return true;
	}
	
	public void showMessage(String message){
		System.out.println("[Info] "+message);
	}
	@Override
	public TreeNode getRootNode() {
		// TODO Auto-generated method stub
		return rootnode;
	}	
}
