package reflectionapi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class Test05_ReadingStoringModifyingUsingRA{
	public static void main(String[] args) 
				throws ClassNotFoundException, 
							NoSuchMethodException, InvocationTargetException,							
								InstantiationException, IllegalAccessException,									  
										NoSuchFieldException {

		Class cls = Class.forName("reflectionapi.A"); 
		Object obj = cls.getDeclaredConstructor().newInstance();
		System.out.println();

//===========================================
		
		Field fa = cls.getDeclaredField("a");
		System.out.println("fa: "+ fa);

		Field fx = cls.getDeclaredField("x");
		System.out.println("fx: "+ fx);
		
		System.out.println();
//===========================================
		Object aValue = fa.get(obj);
		Object xValue = fx.get(obj);

		System.out.println("a value: "+ aValue);
		System.out.println("x value: "+ xValue);
		System.out.println(); 

//===========================================
		fa.set(obj, 15);
		fx.set(obj, 16);	

//===========================================
		aValue = fa.get(obj);
		xValue = fx.get(obj);

		System.out.println("a value: "+ aValue);
		System.out.println("x value: "+ xValue); /**/
	}
}