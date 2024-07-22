import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:\\sample.txt");
		FileInputStream fis=new FileInputStream(f);
		
		int i=fis.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fis.read();
		}
		fis.read();
		
	}

}
