/*
 * int : 0
 * String : null
 * double : 0.0
 */
public class Student {
	int regNo;
	String name;
	
	//default Constructor
	public Student() {
		System.out.println("Default constructor invoked!!");
		regNo=101;
		name="Rajesh";
	}
	public Student(int no,String n) {
		System.out.println("Default constructor invoked!!");
		regNo=no;
		name=n;;
	}
	
	public void displayStudent() {
		System.out.println(regNo +" , "+name);
	}
	
	public static void main(String[] args) {
		Student student1=new Student(101,"Rajesh");
		Student student2=new Student(102,"Vikas");
		Student student3=new Student(103,"Yogesh");
		Student student4=new Student(104,"Jay");
		Student student5=new Student(105,"Umesh");
		student1.displayStudent();
		student2.displayStudent();
		student3.displayStudent();
		student4.displayStudent();
		student5.displayStudent();
		
	}
}
