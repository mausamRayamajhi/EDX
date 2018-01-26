package random;

import java.util.LinkedList;
import java.util.Queue;

public class Queqe {

	public static void main(String[] args) {
		Queue queue = new LinkedList();
		queue.add(5);
		queue.add(6);
		queue.add(7);

		queue.add(5);

		queue.add(2);
System.out.println("After Add = "+queue);

		queue.remove();
		System.out.println("After remove= "+queue);

		System.out.println("First = "+ queue.poll());
		System.out.println("After Pool = "+queue);
		System.out.println("Last = "+queue.peek());
	
	
	}

}
