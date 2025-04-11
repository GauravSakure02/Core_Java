package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_FOS {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//connection is established to the abc.txt file for writing
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		//writing data to abc.txt file
		fos.write(5);
		fos.write(97);
		fos.write('b');
		fos.write(150);
		
		fos.write(350);		//exceeding the byte range 0-255
		fos.write(750);		//value is reduced to the range of 0-255
		fos.write(-97);		//then the changed value is stored in the file

//		fos.write(9010454584L);		//we can not pass a value beyond the int range
//		fos.write(20000.0);			//we will get compile time error
//		fos.write(true);
//		fos.write("Hari");
		
		fos.write("Hari".getBytes());	//for writing String, we must convert it into byte[]
		
		System.out.println("data is saved");

		fos.close();
	}
}