import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(1, "Rajesh");
		students.put(3, "Sachin");
		students.put(2, "Yogesh");
		//Entry:entrySet
		
		//iterate through only keys
		System.out.println("keys:");
		for(Integer key:students.keySet())
			System.out.println(key);
		
		System.out.println("values:");
		for(String studentName:students.values())
			System.out.println(studentName);
		
		System.out.println("Entries:");
		for(Entry<Integer,String> entry: students.entrySet()) {
			System.out.println(entry);
		}
	}

}
