package collectiondemo;

import java.util.ArrayList;

public class CollectionAdvance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("John","Doe");
		Employee e2=new Employee("Dave","Smith");
		Employee e3=new Employee("Kevin","MacMilan");
		Employee e4=new Employee("Dave","Smith");
		Employee e5=new Employee("David","Gover");
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		//System.out.println(employees);
//		System.out.print("");
		
		for(Employee e:employees) {
			e.displayEmployeeDetails();
		}
		
		System.out.println(employees.contains(e1));
		
		
		
		
		

	}

}
