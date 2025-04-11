package com.variable;
class Test_Variable_LT_Scope  {
	public static void main(String[] args) {
		System.out.println("main start");
		//System.out.println(a); //CE: c f s variable a in class Test
		
		System.out.println(Example.a);
		System.out.println(Example.b);
		Example.m1();
		Example.m2();

	//=============================================================	
		Sample.m3(50);	//Accessing Parameter and LV via method call
	//=============================================================	
		System.out.println("main end");
	}//main close
	
}//class Test close
