package pack1;

public class AdvanceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data_type array_name[]=new data_type[size]
		Student[] students=new Student[5];
		students[0]=new Student(101,"Jay");
		students[1]=new Student(102,"Vijay");
		students[2]=new Student(103,"Rajesh");
		students[3]=new Student(104,"Amit");
		students[4]=new Student(105,"Ram");
		
		for(int i=0;i<students.length;i++) {
			students[i].dislayStudent();
		}
		

	}

}
