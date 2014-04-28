package erik.mcmaster.ds.tree;

import java.util.ArrayList;

public interface MyBinarySearchTree {
	boolean addNode(TreeNode theNode, TreeNode rootnode);
	boolean findNode(int value, TreeNode rootnode);
	boolean createTree(int[] thevalues);
	TreeNode getRootNode();
	int numOfNodes(TreeNode therootnode);
	int depthOfTree(TreeNode therootnode);
	boolean deleteNode();
}
