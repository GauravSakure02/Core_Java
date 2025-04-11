package reflectionapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test06_InvokingMethodUsingRA {
	@SuppressWarnings({"deprecation", "unchecked"})
	public static void main(String[] args) 
								throws ClassNotFoundException,
												 NoSuchMethodException, InvocationTargetException, 
												      InstantiationException,IllegalAccessException {

		Class cls = Class.forName("reflectionapi.A");
		Object obj = cls.getDeclaredConstructor().newInstance();
		System.out.println(); //A a1 = new A();

		Method m1 = cls.getDeclaredMethod("m3");
		Object rv = m1.invoke(obj);  //a1.m3();
		System.out.println(rv);

		Method m2 = cls.getDeclaredMethod("m3", int.class);
		rv = m2.invoke(obj, 5); //String s = a1.m3(5);
		System.out.println(rv);
		
		Method m3 = cls.getDeclaredMethod("m4");
		rv = m3.invoke(obj);	//a1.m4();
		System.out.println(rv);

		Method m4 = cls.getDeclaredMethod("m4", String.class);
		rv = m4.invoke(obj, "bbc"); //float f1 = a1.m4("bbc");
		System.out.println(rv);		
	}
}