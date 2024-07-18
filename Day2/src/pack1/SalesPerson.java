package pack1;

public class SalesPerson extends Employee{
	private double sales;
	private double commission;
	private double grossSalary;
	public SalesPerson(int empId, String empName, double basicSalary, double sales) {
		super(empId,empName,basicSalary);
		this.sales = sales;
		this.commission=0.08;
	}
	public void calculateSalary() {
		this.grossSalary=super.getBasicSalary()+
				(this.sales*this.commission);
	
	}
	
	public void showEmployeeDetails() {
		System.out.println(super.getEmpId()+","+super.getEmpName()+","+
					this.grossSalary);
	}
	
	public static void main(String[] args) {
		SalesPerson salesPerson1=new SalesPerson(101,"John",18000,400000);
		salesPerson1.calculateSalary();
		salesPerson1.showEmployeeDetails();
		
	
		SalesPerson salesPerson2=new SalesPerson(102,"Derek",18000,800000);
		salesPerson2.calculateSalary();
		salesPerson2.showEmployeeDetails();
	
	}
	

}
