package reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class  Test07_AccessingPrivateMembers{
	public static void main(String[] args)  throws Exception{
		
		Class cls = Class.forName("reflectionapi.P");	

		Constructor cns = cls.getDeclaredConstructor();
		cns.setAccessible(true); //making constructor visible to execute
		Object obj = cns.newInstance();

		Field fx = cls.getDeclaredField("x");
		fx.setAccessible(true);
		System.out.println("x: "+ fx.get(obj));

		Method m = cls.getDeclaredMethod("m1");
		m.setAccessible(true);
		System.out.println("rv: "+ m.invoke(obj));

	}
}