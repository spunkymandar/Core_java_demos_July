
public class Sample {
	int x,y;
	public Sample() {
		this(20);
		x=10;
	}
	public Sample(int y) {
		//this();//invoke the default constructor for current object 
		this.y=y;
	}
	public void displayData() {
		System.out.println("x ="+x+" , y= "+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample1=new Sample();//invoke the parameterized constructor
		sample1.displayData();
	}

}
