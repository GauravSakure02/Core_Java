package com.variable;

class Example1 {

	static int a = 10;
	int x = 20;
		
	public static void main(String[] args) {
	
		Example1 e1 = new Example1();
		Example1 e2 = new Example1();
		
		System.out.println(e1.a + "  " + e1.x);
		System.out.println(e2.a + "  " + e2.x);
		System.out.println();
		
		e1.a = 15;
		e1.x = 16;

		System.out.println(e1.a + "  " + e1.x);
		System.out.println(e2.a + "  " + e2.x);

	}
	
	
	
	
	static void m1(int p) {
		int q = 60;
		
		p = 70;
		q = 70;
	}
	
	static void m2() {
		//System.out.println(p);	//CE: c f s variable p
		//Sopln(q);	//CE: c f s variable q	
	}
	
}
