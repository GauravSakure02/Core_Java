package collection2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test23_Properties_Loading {
	public static void main(String[] args) throws IOException{
		
		Properties props = new Properties();
		props.load(new FileReader("empdata.properties"));
		//System.out.println(props);
		
		String eno 		= props.getProperty("eno");
		String ename 	= props.getProperty("ename");
		String dept 	= props.getProperty("dept");
		String exp	 	= props.getProperty("exp");
		
		System.out.println("eno\t: " 	+ eno);
		System.out.println("ename\t: " 	+ ename);
		System.out.println("dept\t: " 	+ dept);
		System.out.println("exp\t: " 	+ exp);
	}
}