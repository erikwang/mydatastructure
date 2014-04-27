package erik.mcmaster.ds.tree;

import java.util.ArrayList;

public interface MyBinarySearchTree {
	boolean addNode(TreeNode theNode, TreeNode rootnode);
	boolean findNode(int value, TreeNode rootnode);
	boolean createTree();
	TreeNode getRootNode();
}
