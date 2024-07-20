//Collection->Deque->ArrayDeque
import java.util.ArrayDeque;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> numbers=new ArrayDeque<Integer>();
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println(numbers);
		
		System.out.println(numbers.peekFirst());
		System.out.println(numbers.peekLast());
		
		
		System.out.println(numbers.pollFirst());
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
	}

}
