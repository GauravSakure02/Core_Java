package reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test04_InstantiatingUsingConstructor {
	public static void main(String[] args)
						throws ClassNotFoundException, 
								InstantiationException, 
								IllegalAccessException, 
								NoSuchMethodException,
								InvocationTargetException{

		Class cls = Class.forName("reflectionapi.A");
		System.out.println();

	//creating object of the loaded class by using NPC
		//Object obj = cls.newInstance();  //deprecated
		//Constructor npc = cls.getConstructor();
		Constructor npc = cls.getDeclaredConstructor(); //1. obtaining NPC object
		Object obj1 = npc.newInstance();	//2. invoking and executing NPC 
		System.out.println(obj1);
		System.out.println();

		Object obj2 = npc.newInstance(); //2. invoking and executing NPC again 
		System.out.println(obj2);		//    to create second object
		System.out.println(); 
//=========================================
	//creating object of the loaded class by using IPC
		Constructor ipc = cls.getDeclaredConstructor(int.class); // //1. obtaining IPC object
		Object obj3 = ipc.newInstance(50);	//2. invoking and executing IPC 
		System.out.println(obj3);
		System.out.println();

		Object obj4 = ipc.newInstance(60); //2. invoking and executing IPC 
		System.out.println(obj4);			//for creating one object by using IPC
		System.out.println();

//====================================

		A a1 = (A)obj1;
		A a2 = (A)obj2;
		A a3 = (A)obj3;
		A a4 = (A)obj4;

		System.out.println("a1.x: "+ a1.x);
		System.out.println("a2.x: "+ a2.x);
		System.out.println("a3.x: "+ a3.x);
		System.out.println("a4.x: "+ a4.x);
		System.out.println();
/**/
	}
}