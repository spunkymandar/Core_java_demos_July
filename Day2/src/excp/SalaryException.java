package excp;

public class SalaryException extends Exception {
	int salary;
	public SalaryException(int salary) {
		this.salary=salary;
	}
	
	public String toString() {
		return "Salary Exception occured, "+salary+" is less than 8000";
	}

}
