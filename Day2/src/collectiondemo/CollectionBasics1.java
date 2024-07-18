package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Yash");
		names.add("Aum");
		names.add("Rajesh");
		names.add("John");
		names.add("Rajesh");
		
		System.out.println(names);//Type1
		
		//Type2 :Traditional for loop
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));//get() used to retrive the element at the given indx numer
		}
		
		//Type3: enhanced for loop
		for(String name : names) {
			System.out.println(name);
		}
		
		//Thpe4: using Iterator
		Iterator<String> nameiterator=names.iterator();
		while(nameiterator.hasNext()) {
			System.out.println(nameiterator.next());
		}
		//add(), get()
		names.add(3, "Davis");
		System.out.println(names);
		System.out.println("Is Mandar added: "+names.contains("Mandar"));
		System.out.println("Location of Rajesh:"+names.lastIndexOf("Rajesh"));
		
		names.remove("Davis");
		System.out.println(names);
		
		names.set(3, "John1");
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
