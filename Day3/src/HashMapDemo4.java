import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Java 9to17",1500);
		Book b2=new Book("Java Interview",800);
		Book b3=new Book("Java Microservices",1700);
		
		Book b4=new Book("ASP.Net professional",500);
		Book b5=new Book("Learn C#",1700);
		
		
		Book b6=new Book("Core Python",500);
		
		ArrayList<Book> javabooks=new ArrayList<Book>();
		javabooks.add(b1);javabooks.add(b2);javabooks.add(b3);
		
		ArrayList<Book> dotnetbooks=new ArrayList<Book>();
		dotnetbooks.add(b4);dotnetbooks.add(b5);
		
		ArrayList<Book> pythonbooks=new ArrayList<Book>();
		pythonbooks.add(b6);
		
		HashMap<String,ArrayList<Book>> library=
				new HashMap<String, ArrayList<Book>>();
		library.put("Java", javabooks);
		library.put("DotNet", dotnetbooks);
		library.put("Python", pythonbooks);
		
		System.out.println(library);
		
		System.out.println(library.keySet());
		System.out.println(library.values());


	}

}
