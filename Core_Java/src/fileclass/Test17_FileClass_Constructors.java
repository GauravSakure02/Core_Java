package fileclass;

import java.io.File;

public class Test17_FileClass_Constructors {
	public static void main(String[] args) {
		
		File file1 = new File("xyz.txt");
		System.out.println("file1: "+ file1);
			
		File file2 = new File("abc", "xyz.txt");
		System.out.println("file2: "+ file2);
				
		File file3 = new File("bbc");
		System.out.println("file3: "+ file3);
			
		File file4 = new File(file3, "pqr.txt");
		System.out.println("file4: "+ file4);
				
		File file5 = new File(file3, "cbc");
		System.out.println("file5: "+ file5);
		
/* */		
	}
}