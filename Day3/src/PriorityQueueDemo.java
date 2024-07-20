import java.util.PriorityQueue;
//Collection->Queue->PriorityQueue

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
		numbers.add(15);
		numbers.add(8);
		numbers.add(10);
		
		System.out.println(numbers);
		numbers.offer(4);
		System.out.println(numbers);
		
		System.out.println(numbers.peek());//only retrieves
		System.out.println(numbers);
		System.out.println(numbers.poll());//retrive and remove
		System.out.println(numbers);
	
		
		
		
	}

}
