
public class TriangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle1=new Triangle(10);//base=10, height=20
		System.out.println(triangle1.getBase()+ ", "+triangle1.getHeight());
		triangle1.calculateArea();
//		triangle1.base=200;
//		triangle1.height=110;
		triangle1.setBase(200);//base=200,height=400
		System.out.println(triangle1.getBase()+ ", "+triangle1.getHeight());
		triangle1.calculateArea();
		
		triangle1.setBase(5);//base=5, height=10
		System.out.println(triangle1.getBase()+ ", "+triangle1.getHeight());
		triangle1.calculateArea();
		
	}

}
