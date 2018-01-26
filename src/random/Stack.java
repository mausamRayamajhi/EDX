package random;

public class Stack {

	public static void main(String[] args) {
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack);
		
		System.out.println("Pop = "+stack.pop());
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
	}

}
