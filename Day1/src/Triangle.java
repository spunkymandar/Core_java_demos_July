/*
 * Create a Triagle class with the properties of base and height
 * height should be double of base. 
 * base will be entered by the user
 * calculate the area of triangle 
 */
//Tight encapsulation is achieved by creating private variables and accessig it through
//public member functions

public class Triangle {
	private int base,height;
	private double area;
	//getter-setter for base
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base=base;
		this.height=this.base*2;
	}
	
	//getter-setter for height
	public int getHeight() {
		return height;
	}
//	public void setHeight(int height) {
//		this.height=height;
//	}
	
	
	
	public Triangle(int base) {
		this.base=base;
		this.height=this.base*2;
	}
	public void calculateArea() {
		area=0.5*this.height*this.base;
		System.out.println("Area of triangle :"+area);
	}
	
	
	

}
