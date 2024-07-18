package excp;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10,0};

		int div;

		try {
			div = numbers[0] / numbers[1];
			System.out.println("Division = " + div);
			/*
			 * line15
			 * line16
			 * line17
			 * 
			 */
		} catch (ArithmeticException ae) {
			System.out.println("Second array element must be non zero");
			/*
			 * line 24
			 * line 25
			 */
		} catch(ArrayIndexOutOfBoundsException aeobe) {
			System.out.println("ARray must present atleast 2 elements");
		}
		finally {
			System.out.println("finally block executed");
		}
	}

}
