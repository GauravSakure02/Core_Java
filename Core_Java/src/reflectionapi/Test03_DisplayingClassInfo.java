package reflectionapi;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

class Test03_DisplayingClassInfo {
	public static void main(String[] args)
						throws ClassNotFoundException{

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter class name: ");

		Class cls = Class.forName(scn.nextLine());
		
		System.out.println("module name: "+ cls.getModule());
		System.out.println("package name: "+ cls.getPackageName());
		System.out.println("annotations: "+ Arrays.toString(cls.getAnnotations()));
		System.out.println("modifiers: "+ Modifier.toString(cls.getModifiers()));

		System.out.println("class name: "+ cls.getName());
		System.out.println("class sname: "+ cls.getSimpleName());
		System.out.println("super class: "+ cls.getSuperclass());
		System.out.println("interfaces: "+ Arrays.toString(cls.getInterfaces()));
		
		System.out.println("Fields: "+ Arrays.toString(cls.getFields()));	
		System.out.println("Fields: "+ Arrays.toString(cls.getDeclaredFields()));	

		System.out.println("Constructors: "+ Arrays.toString(cls.getConstructors()));	
		System.out.println("Constructors: "+ Arrays.toString(cls.getDeclaredConstructors()));	

		System.out.println("Methods: "+ Arrays.toString(cls.getMethods()));	
		System.out.println("Methods: "+ Arrays.toString(cls.getDeclaredMethods()));	
/**/
	}
}