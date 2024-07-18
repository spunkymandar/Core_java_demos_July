package pack1;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		
	}
	
	public void dislayStudent() {
		System.out.println(studentId+" , "+studentName);
	}
	public boolean equals(Object o) { //Object o=new Student()
		Student s=(Student)o;
		if(this.studentId==s.studentId && this.studentName.equals(s.studentName)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Student student1=new Student(1,"Ajay");//
		Student student2=new Student(1,"jay");//
		System.out.println(student1);
		System.out.println(student2);
		
//		if(student1.equals(student2)) {
//			System.out.println("Objects are equal");
//		}
//		else {
//			System.out.println("Objects are not equal");
//		}
		
		if(student1==student2) {
			System.out.println("Objects are equal");
		}
		else
			System.out.println("Objects are not equal");
	}

}
