package excp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//refer the file 
		File f = new File("a.text");
		try {
			//open the file in the read mode
			FileInputStream fis = new FileInputStream(f);

		} catch (FileNotFoundException fnf) {

		}

	}

}
