package erik.mcmaster.ds.test;

import erik.mcmaster.ds.tree.MyBinarySearchTree;
import erik.mcmaster.ds.tree.MyBinarySearchTreeImpl;

public class TestBinarySearchTree {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] thevalues = {423,323,4123,333,2243,5423,123,543,234,1323};
		
		MyBinarySearchTree mbst = new MyBinarySearchTreeImpl();
		
		//test create a tree
		mbst.createTree(thevalues);
		
		//test whether or not value 333 in tree
		mbst.findNode(333,mbst.getRootNode());
		
		//test the number of nodes
		System.out.println("Expected # of nodes is "+thevalues.length+", count result is "+mbst.numOfNodes(mbst.getRootNode()));
		
		//test the depth of the tree
		System.out.println("Depth of the tree is "+mbst.depthOfTree(mbst.getRootNode()));
	}

}
