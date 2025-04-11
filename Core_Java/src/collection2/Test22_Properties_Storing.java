package collection2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test22_Properties_Storing {
	public static void main(String[] args) throws IOException{
		
		Properties props = new Properties();
		props.setProperty("eno", "7279");
		props.setProperty("ename", "Hari");
		props.setProperty("dept", "Java");
		props.setProperty("exp", "20 Years");
		
		System.out.println(props);
		props.store(new FileWriter("empdata.properties"), "Emp Data");
		System.out.println("Properties are saved in file");
	}
}