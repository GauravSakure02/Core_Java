package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test07_OIS {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream( 
						new FileInputStream("object.ser"));
		
		Object obj = ois.readObject();
		Student st =(Student)obj;
		System.out.println(st);
		
	}
}
