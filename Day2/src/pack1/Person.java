package pack1;
// everyclass by default extends "Object" super class
public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	//overriding the toString() method
	public String toString() {
		return "Name of Person: "+this.name;
	}
	
	public static void main(String[] args) {
		Person p=new Person("John");
		System.out.println(p);//invokes toString() method
	}

}
//Object->Person

/*
 * toString() : String representation of Object
 * clone() : create the copy of object
 * hashCode() : used to refer the buckets created by object
 * equals(); Used to check the euqality of the object
 * getClass() : used to find the class of the object it refers to 
 * 
 * 
 * 
 */


