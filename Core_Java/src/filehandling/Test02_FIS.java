package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_FIS {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//connection is established to the abc.txt file for reading
		FileInputStream fis = new FileInputStream("abc.txt");
		
		//writing data to abc.txt file
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());

		
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());

		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());

		fis.close();
	}
}