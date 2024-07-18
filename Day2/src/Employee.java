
public class Employee {
	private int empId;//instance
	private String empName;//instance
	private static int counter;//class variables
	
	//constructor
	public Employee(int empId, String empName) {
		System.out.println("Constructor called ");
		counter++;
		this.empId=empId;
		this.empName=empName;
	}
	//a method which is class level method
	//can be invoked with classname.methodname
	public static int getCounter() {
		return counter;
	}
	
	
	public void doSomething() {
		int data=21;//local variable
		//System.out.println(data);
		boolean ans=false;
		if(data>10) {
			ans=true;
		}
		
		System.out.println(ans);
		
		
		
		
	}
	public static void main(String[] args) {
		
		Employee employee1=new Employee(101,"John");
		Employee employee2=new Employee(102,"Derek");
		Employee employee3=new Employee(103,"Wilson");
		
		System.out.println("Total Employees="+Employee.getCounter());
		
	}
	
}
//init :counter=0
//for each object :counter++
//print counter