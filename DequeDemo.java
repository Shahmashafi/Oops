import java.util.Deque;
import java.util.ArrayDeque;
public class DequeDemo
{
	public static void main(String[] args)
	{
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("APPLE");
		deque.addLast("BANANA");
		deque.addFirst("CHERRY");
		deque.addLast("DATE");
		System.out.println("Deque after addition:"+deque);
		deque.removeFirst();
                System.out.println("After removing first element using removeFirst():"+deque);
		deque.pollFirst();
		System.out.println("After removing second element using pollFirst():"+deque);	
		deque.pollLast();
		System.out.println("After removing last element using pollLast():"+deque);	
	}
}	
	
	
	
	
