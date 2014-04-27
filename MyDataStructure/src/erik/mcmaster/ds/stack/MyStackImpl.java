package erik.mcmaster.ds.stack;


public class MyStackImpl implements MyStack{

	MyNode headNode,tailNode,preHeadNode;
	
	public MyStackImpl() {
		tailNode = headNode = null;
	}
		
	public String pop(){
		if(isEmpty()){
			return "Stack is empty, can't pop";
		}else{
			preHeadNode = headNode;
			headNode = preHeadNode.nextNode;
			preHeadNode.nextNode = null;
			return "pop "+preHeadNode.getMycontent();	
		}
		
	}

	@Override
	public boolean push(String str) {
		// TODO Auto-generated method stub
		MyNode theNode = new MyNode(str);
		preHeadNode = headNode;
		if(! isEmpty()){
			preHeadNode.previousNode = theNode;
			theNode.nextNode = preHeadNode;
			headNode = theNode;
			return true;
		}else{
			headNode = theNode;
			return true;
		}
	}

	@Override
	public String peak() {
		return headNode.getMycontent();
	}

	@Override
	public int search(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(headNode == null){
			return true;
		}
		return false;
	}

}
