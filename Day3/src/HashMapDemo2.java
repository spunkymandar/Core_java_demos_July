import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String, ArrayList> library;
		
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(1, "Rajesh");
		students.put(3, "Sachin");
		students.put(2, "Yogesh");
		System.out.println(students);
		students.replace(2, "Avinash");
		System.out.println(students);

	}

}
/*
 * Library : 
 * 		literature : Books [isbn, name]
 * 		String				Integer, String
 * 		technology : isbn, name
 * 		drama
 * 
 * 		HashMap<String, HashmMap<Integer,String>> library;
 * 
 * 
 * 
 * 
 */










