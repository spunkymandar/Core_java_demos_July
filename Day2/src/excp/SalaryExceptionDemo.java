package excp;

public class SalaryExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicSalary=12500;
		
		try {
		if(basicSalary<8000)
			
			throw new SalaryException(basicSalary);
		else
			System.out.println("Salary is acording to norms");
		}
		catch(SalaryException e) {
			System.out.println(e);
		}

	}

}
