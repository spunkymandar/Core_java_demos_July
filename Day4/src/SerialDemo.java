import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1=new Student(2,"Akash");
		File f=new File("d:\\student.txt");
		FileOutputStream fos=new FileOutputStream(f);
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("Object serialized");

	}

}
