package datastructure.stacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
	
		MyStack<Integer> stack =new MyStack<>();		
		
		stack.push(15);
		stack.push(36);
		stack.push(40);
		
		
		int poped=stack.pop();
	   
		System.out.println(poped+" then ");
	int peeked=stack.peek();
	System.out.println(peeked);
	
	stack.print();

	}

}
