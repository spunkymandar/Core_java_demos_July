package collectiondemo;

import java.util.Comparator;

public class EmpSortByLastNameDesc implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getLastName().compareTo(o1.getLastName());
	}
	

}
