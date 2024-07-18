
public class Circle {
	int radius=10;//datamembers/instance variables
	double circumference,area;
	public void initData(int r) {
		radius=r;
	}
	public void calculateArea() {
		area=3.142*radius*radius;
		System.out.println("Area ="+area);
	}
	
	public void calculateCircumference() {
		circumference=2*3.14*radius;
		System.out.println("Circumference ="+circumference);
	}
	
	public static void main(String[] args) {
		Circle circle1=new Circle();//creation of object
		circle1.initData(5);
		circle1.calculateArea();
		circle1.calculateCircumference();
		
		
		Circle circle2=new Circle();
		circle2.initData(7);
		circle2.calculateArea();
		circle2.calculateCircumference();
		
	}
	
	
	

}
