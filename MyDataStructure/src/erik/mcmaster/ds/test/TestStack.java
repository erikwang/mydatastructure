package erik.mcmaster.ds.test;

import erik.mcmaster.ds.MyStack;
import erik.mcmaster.ds.MyStackImpl;

public class TestStack {

	public TestStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStackImpl();
		ms.push("1");
		ms.push("2");
		ms.push("3");
		ms.push("4");
		ms.push("5");
		ms.push("6");
		ms.push("7");
		
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		
		

		if(ms.isEmpty()){
			System.out.println("Stack is empty");
		}else{
			System.out.println(ms.peak());
		}
		
		
		

	}

}
