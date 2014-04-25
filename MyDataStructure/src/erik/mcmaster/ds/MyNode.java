package erik.mcmaster.ds;

class MyNode {
	protected String mycontent = "";
	protected MyNode nextNode = null;
	protected MyNode previousNode = null;

	MyNode(String content){
		this.mycontent = content;
	}
	
	public String getMycontent() {
		return mycontent;
	}
	public MyNode getNextNode() {
		return nextNode;
	}
	public MyNode getPreviousNode() {
		return previousNode;
	}

}
