package excp;

public class NoExcpetionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntaxially correct : Yes
		// logically correct: Yes
		
		
		int a,b,c,d,e;
		a=10;
		b=0;
		
		c=a/b;
		System.out.println("Division = "+c);

		d=a*b;
		System.out.println("Multiplication ="+d);
		
		e=a+b;
		System.out.println("Addition = "+e);
	}

}
