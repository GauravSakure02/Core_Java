package reflectionapi;
import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
class Test02_Instantiating {
	public static void main(String[] args) throws ClassNotFoundException, 
																InstantiationException, IllegalAccessException, 
															NoSuchMethodException, InvocationTargetException {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter classname");
		String name = scn.next();
		
		Class cls = Class.forName(name);
//		Object obj1 = cls.newInstance(); //no-param constructor is used
//		System.out.println("obj1: "+ obj1);
//		
//object creation by using no-param constrctor

		//Constructor cons1 = cls.getConstrctor(); //returns only if constuctor is public

//		@SuppressWarnings("unchecked")
//		Constructor<?> cons1 = cls.getDeclaredConstructor(); //works for pri, def, pro, pub
//		Object obj2 = cons1.newInstance();
//		System.out.println("obj2: "+ obj2);

//object creation by using int-param constrctor
		@SuppressWarnings("unchecked")
		Constructor<?> cons2 = cls.getDeclaredConstructor(int.class); //pass parameter type
		Object obj3 = cons2.newInstance(50);		//passing argument to int param constructor	
		System.out.println("obj3: "+ obj3);  
	}
}