package com.variable;
class Example {
	static int a = 10;
	static int b = 20;
	
	int x = 30;
	int y = 40;
	
	static void m1() {
		System.out.println("\nm1 is executed");
		System.out.println("  a: "+ a);
//		System.out.println("  x: "+ x); //CE: non-static variable x c n b r f s c  

		Example e1 = new Example();
		System.out.println("  x: "+ e1.x); //CE: non-static variable x c n b r f s  
	}
	
	static void m2() {
		System.out.println("m2 is executed");
		System.out.println("  a: "+ a);
//		System.out.println("  x: "+ x); //CE: non-static variable x c n b r f s c  
//		System.out.println("  x: "+ e1.x);  //CE: c f s variable e1 
		
		Example e2 = new Example();
		System.out.println("  x: "+ e2.x);  
	}
}
