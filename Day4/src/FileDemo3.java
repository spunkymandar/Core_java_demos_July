import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:\\sample.txt");
		
		FileWriter fw=new FileWriter(f);
		fw.write("this is written from Java");
		System.out.println("File written successfully!");
		fw.close();

	}

}
