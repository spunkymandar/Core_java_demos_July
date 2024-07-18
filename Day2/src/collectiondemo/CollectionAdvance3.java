/*
 * ArrayList :
 * HashSet : equals(), hashCode()
 * TreeSet : equals(), hashCode(), compareTo()
 * 
 */

package collectiondemo;

import java.util.TreeSet;
//TreeSet: Uniqueness, Sorted
//To check the equality, the class must have equals() and hashCode() method
//To sort the objects, your class must implement comparable interface
public class CollectionAdvance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("John","Doe");
		Employee e2=new Employee("Dave","Smith");
		Employee e3=new Employee("Kevin","MacMilan");
		Employee e4=new Employee("Dave","Smith");
		Employee e5=new Employee("David","Gover");
		TreeSet<Employee> employees=new TreeSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		
		for(Employee employee:employees) {
			employee.displayEmployeeDetails();
		}
		
	}

}
