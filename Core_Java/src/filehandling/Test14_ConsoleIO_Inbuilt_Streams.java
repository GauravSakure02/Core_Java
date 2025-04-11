package filehandling;

import java.io.IOException;

public class Test14_ConsoleIO_Inbuilt_Streams {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hi");
		System.err.println("Hello");
		
		
		System.out.println("Enter name: ");
		
		int data1 = System.in.read();
		int data2 = System.in.read();
		int data3 = System.in.read();
		int data4 = System.in.read();
		System.out.println(data1  + " " + (char) data1);
		System.out.println(data2  + " " + (char) data2);
		System.out.println(data3  + " " + (char) data3);
		System.out.println(data4  + " " + (char) data4);
		
	//Solution: Use BufferedReader.readLine() 
		
		
	}
}