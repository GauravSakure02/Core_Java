package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test10_BR {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new FileReader("abc.txt"));
		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());

//		String line;
//		while((line = br.readLine()) !=null) {
//			System.out.println(line);
//		}

		
		while(br.ready()) {
			String line = br.readLine();
			System.out.println(line);
		}		
		br.close();
	}
}