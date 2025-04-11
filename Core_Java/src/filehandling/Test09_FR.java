package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Test09_FR {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("mno.txt");
		int data;
		while((data = fr.read()) !=-1) {
			System.out.println(data + "\t"+(char)data);
		}
		
		fr.close();
	}
}