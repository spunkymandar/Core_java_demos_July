
public class Student {
	int studentId;
	String studentName;
	Date dt_of_birth;
	Date dt_of_admission;
	public Student(int studentId, String studentName, Date dt_of_birth, 
			Date dt_of_admission) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.dt_of_birth = dt_of_birth;
		this.dt_of_admission = dt_of_admission;
	}
	public void displayStudent() {
		System.out.println(this.studentId+" , "+this.studentName+" , "+
					this.dt_of_birth.displayDate()+","+this.dt_of_admission.displayDate());
		
	}
	public static void main(String[] args) {
		Date dt_of_birth=new Date(10,4,2002);
		Date dt_of_admission=new Date(26,6,2024);
		if(dt_of_birth.isValidDate()==true & dt_of_admission.isValidDate()==true) {
//		Student s1=new Student(101,"Aum",new Date(10,4,2002),new Date(26,6,2024));
			Student s1=new Student(101,"Aum",dt_of_birth,dt_of_admission);
			System.out.println("Student enrolled successfully!!");
			s1.displayStudent();
		}
		else {
			System.out.println("Invalid DOB or DOA, cannot enroll the student!");
		}
		
		
		
		
	}
	
	
}
