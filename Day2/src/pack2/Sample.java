package pack2;

public class Sample implements Interface1,Interface2{
	public void doTask1() {
		System.out.println("In doTask1 of Sample!!");
	}

	public void doTask2() {
		// TODO Auto-generated method stub
		System.out.println("In doTask2 of Sample");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		
		s.doTask1();
		s.doTask2();
	}

	

}
