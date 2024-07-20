/*
 * Map->HashMap    : Unique,
 * HashMap<K,V> mymap=new HashMap<K,V>();
 * K=key (Object)
 * V=value(Object)
 * names: RegNo , Name
 */
import java.util.HashMap;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(1, "Rajesh");
		students.put(3, "Sachin");
		students.put(2, "Yogesh");
		//students.put(2, "Sachin");//Key must be unique
		System.out.println(students);//returns all the entries in array format
		
		String name=students.get(3);
		System.out.println(name);
		
		
		System.out.println(students.keySet());//returns all the keys of the map
		
		System.out.println(students.values());//returns all the values of the map
		
		System.out.println(students.entrySet());
		
		
		
		
	}

}
