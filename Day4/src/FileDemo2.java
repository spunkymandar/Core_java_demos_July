/*
 * File IO
 * 	1. Character Hierarchy
 * 		FileReader :to read file in character mode
 * 		FileWriter :to write file in character mode
 * 	2. Byte Hierarchy
 * 		FileInputStream :to read file in byte mode
 * 		FileOutputStream:to write file in byte mode
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		File f=new File("d:\\sample.txt");
		
		char[] data=new char[100];
		
		try {
			FileReader fr=new FileReader(f);
			try {
				fr.read(data);//read all the characters from the file and store in array
				System.out.println(data);//print the array
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
