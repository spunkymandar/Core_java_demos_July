package collectiondemo;

public class Employee implements Comparable<Employee> {
	
	private String firstName, lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//System.out.println(this.firstName+" , "+o.firstName);
		return this.firstName.compareTo(o.firstName);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public void displayEmployeeDetails() {
		System.out.println(this.firstName+" , "+this.lastName);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Equals invoked !!");
		Employee e=(Employee)obj;
		if(this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return firstName.length()+lastName.length()+2;
	}

	
	
	
	

}
