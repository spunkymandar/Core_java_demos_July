
//superclass
//subclass
/*
 * B is subclass of A
 * A is superclass of B
 */
public class B extends A {
	//chaining of constructors in inheritance
	public B() {
		super();//invokes superclass constructor
		System.out.println("In constructor B");
	}
	public void displayB() {
		System.out.println("In class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();//invokes the default constructor of B
		b1.displayA();
		b1.displayB();
		System.out.println(b1.y);
	}

}
