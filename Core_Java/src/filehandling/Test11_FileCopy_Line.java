package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test11_FileCopy_Line {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new FileReader("abc.txt"));
		FileWriter fw = new FileWriter("bbc.txt");
		
		while(br.ready()) {
			String line = br.readLine();
			fw.write(line);
			fw.write('\n');
		}
		fw.flush();
		
		System.out.println("file copied");
		fw.close();
		br.close();
		
	}
}