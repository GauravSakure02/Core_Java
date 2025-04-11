package objectclass;

import java.util.Arrays;

public class Test05_getClass {
	public static void main(String[] args) {
		
		String s1 = "a";  //[1. class 'Class' object is created with String class byte code]
		
		Class cls =  s1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getPackageName());
		System.out.println(cls.getModule());
		System.out.println();
		
		Example e1 = new Example(5, 6);
		Class cls2 = e1.getClass();
		System.out.println(cls2.getModule());
		System.out.println(cls2.getPackage());
		System.out.println(cls2.getName());
		System.out.println(Arrays.toString(cls2.getDeclaredFields()));
		System.out.println(Arrays.toString(cls2.getDeclaredConstructors()));
		System.out.println(Arrays.toString(cls2.getDeclaredMethods()));
		System.out.println();
				
		m1(s1);
		m1(e1); /* */
	}
	
	static void m1(Object obj) {
		System.out.println("You passed " + obj.getClass().getSimpleName() + " class object");
	}
}