import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:\\sample.txt");
		FileOutputStream fos=new FileOutputStream(f);
		fos.write("Welcome".getBytes());
		System.out.println("File written successfully");

	}

}
