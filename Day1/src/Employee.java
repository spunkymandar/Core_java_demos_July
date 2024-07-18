/*
 * Create a class Employee with with following attribute: 
 * empId, empName, empBasicSalary, da=8% bs, hra=12% bs
 * Intiiate the basic salary and calculate the grossSalary
 * 
 */

public class Employee {
	private int empId, empBasicSalary;
	private double da, hra, grossSalary;
	private String empName;
	
	public Employee(int empId, String empName, int empBasicSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empBasicSalary=empBasicSalary;
		da=0.08*this.empBasicSalary;
		hra=0.12*this.empBasicSalary;
		
	}
	
	public double getDa() {
		return da;
	}
	public double getHra() {
		return hra;
	}
	
	public void calculateGrossSalary() {
//		this.grossSalary=this.empBasicSalary+ da+hra;
		this.grossSalary=this.empBasicSalary+ this.getDa()+this.getHra();
	}
	
	public void displayEmployeeInformation() {
		System.out.println(this.empId+" , "+this.empName+" , "+this.grossSalary);
	}
	
	
}
