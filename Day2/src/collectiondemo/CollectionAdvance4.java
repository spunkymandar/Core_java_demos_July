package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAdvance4 {
	public static void main(String[] args) {
		Employee e1=new Employee("John","Doe");
		Employee e2=new Employee("Dave","Smith");
		Employee e3=new Employee("Kevin","MacMilan");
		Employee e4=new Employee("Dave","Smith");
		Employee e5=new Employee("David","Gover");
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);
		employees.add(e5);
		
		Collections.sort(employees,new EmpSortByLastNameDesc());
		
		for(Employee employee:employees) {
			employee.displayEmployeeDetails();
		}
		
		
		
	}
}
