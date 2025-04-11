package collection1;

import java.util.Stack;

public class Test04_Stack {
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
	//=================================================	
		stack.add(5);
		System.out.println(stack);

		System.out.println(stack.get(0));
		System.out.println(stack.get(2));
	//=================================================
		
	//Java 5v onwards it is recommended to use ArrayDeque instead of Stack 
	//for retrieving objects in LIFO order
		
		
	}
}