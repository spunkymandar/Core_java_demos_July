/*
 * Serialization is a process of storing the object state in the file
 * To store the object, your clas must implement Serializable interface
 * Serializable is marker interface, which does not have any method
 */

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
