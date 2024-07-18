package excp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		
		try {
			processFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//throws, indicates that the function is throwing some exception
	//But the function is not handling it, but the invoker should handle it. 
	private static void processFile() throws FileNotFoundException{
		// TODO Auto-generated method stub
		File f=new File("a.txt"); //refers to file
		FileInputStream fis=new FileInputStream(f); //this opens the file in the read mode
		
		
	}

}
