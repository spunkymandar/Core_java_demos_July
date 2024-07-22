import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:\\sample.txt");
		f.delete();
		//f.mk
		System.out.println("File deleted successfully!");
	}

}
