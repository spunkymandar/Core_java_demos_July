
public class Calculator {

	//data members : instance variables
	int firstNumber, secondNumber, finalAnswer;
	
	public void initNumbers(int first,int second) {
		System.out.println("Inside initNumbers() of Calculator class.. ");
		firstNumber=first;
		secondNumber=second;
	}
	
	public void addNumbers() {
		int ans=firstNumber+secondNumber;
		System.out.println("Addition ="+ans);
	}
	public void substractNumbers() {
		
	}
	public void multiplyNumbers() {
		
	}
	public void divideNumbers() {
		
	}
	public static void main(String[] args) {
		//creating an object: 
		//class_name ref=new class_name();
		Calculator calculator1=new Calculator();//new Calculator() is an object
		calculator1.initNumbers(20, 10);
		calculator1.addNumbers();
		
		
		
	}

}
