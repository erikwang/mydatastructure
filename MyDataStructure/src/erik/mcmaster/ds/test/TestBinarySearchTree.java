package erik.mcmaster.ds.test;

import erik.mcmaster.ds.tree.MyBinarySearchTree;
import erik.mcmaster.ds.tree.MyBinarySearchTreeImpl;

public class TestBinarySearchTree {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] thevalues = {423,323,423,333,2243,5423,123,543,234,123};
		
		MyBinarySearchTree mbst = new MyBinarySearchTreeImpl();
		mbst.createTree();
		mbst.findNode(333,mbst.getRootNode());
	}

}
