package reflectionapi;
import java.util.Scanner;
class Test01_DynamicLoading {
	public static void main(String[] args)
						throws ClassNotFoundException,
								InstantiationException,
							   	IllegalAccessException {
		 
		Scanner scn = new Scanner(System.in);
		
		//reading class name from keyboard
		System.out.print("Enter class name: ");
		String clsName = scn.next();	
		//Reflection API
		//1. 
		Class cls = Class.forName(clsName);	
		System.out.println();		
							
		@SuppressWarnings("deprecation")
		Object obj = cls.newInstance();		
		System.out.println();				
								

		System.out.println(obj);  

	}
}
