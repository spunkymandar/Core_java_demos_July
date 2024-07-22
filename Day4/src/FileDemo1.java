import java.io.*;
//import java.nio.*;
/*
 * File IO always requires to handle the checked exception
 */

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:\\sample.txt");
		if (f.exists()) {
			System.out.println("File is already present");
		} else {
			try {
				f.createNewFile();// creates a new file
				System.out.println("File created successfully!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// fopen("a.txt","r");C program

	}

}
