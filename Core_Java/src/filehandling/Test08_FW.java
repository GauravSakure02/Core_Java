package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test08_FW {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("mno.txt");
		fw.write(97);
		fw.write('b');
		fw.write(260);
		fw.write(65000);
		fw.write(66000);
		fw.write("Hari");
		fw.flush();
		
		System.out.println("data is saved");
		fw.close();
	}
}