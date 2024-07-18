package excp;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,div,mul,add;
		
		a=10;
		b=0;
		try {
			div=a/b;
			System.out.println("Division= "+div);
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero. Change the value b");
		}
		
		mul=a*b;
		System.out.println("Multiplication ="+mul);
		
		add=a+b;
		System.out.println("Addition ="+add);
		

	}

}
