package collectiondemo;

import java.util.HashSet;

public class CollectionAdvance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("John","Doe");//9
		Employee e2=new Employee("Dave","Smith");//11
		Employee e3=new Employee("Kevin","MacMilan");//15
		Employee e4=new Employee("Dave","Smith");//11
		Employee e5=new Employee("David","Gover");//12
		
		HashSet<Employee> employees=new HashSet<Employee>();//unique
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		for(Employee e:employees) {
			e.displayEmployeeDetails();
			System.out.println(e.hashCode());
		}
		
	}

}
