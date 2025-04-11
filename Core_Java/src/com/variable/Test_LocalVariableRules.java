package com.variable;
class Test_LocalVariableRules {
	static void m1() {
		int p = 10;		//this variable is local variable, but not static variable 
	}					//because this method is static, variable is not static
	
	void m2() {
		int q = 20;		//this variable is also local variable, but not non-static 
	}					//because this method is non-static, variable is not NS
	
	//if above variables are either SV or NSV, we can access them in another method.
	//Because they are local variables, we can not access them here, it leads to CE
	void m3(){
		//System.out.println(p);	//CE: c f s variable p	
		//System.out.println(q);	//CE: c f s variable q
	}
	
	//We cannot declare local variable as a static because the keyword static is 
	//allowed only at class level. if we declare a local variable as a static 
	//it should be provided memory when class is loaded and must be accessible to //another methods. Which is not possible in case of local variable.
	//hence we cannot declare local variable as static 
	static void m4() {
		//static int r = 10;	 //CE: i s e
	}
	
	//We cannot access local variable of one method from another method 
	static void m5() {
		int p = 50;	
	}
	
	static void m6(){
		//System.out.println(p);	
	}

	//We cannot access local variable before it is a declaration statement 
	static void m7() {
		//System.out.println(q);	
		
		int q = 70;
		System.out.println(q);	
	}

	//Without initializing a local variable we cannot read that variable 
	//because local variable does not contain default value 
	static void m8() {
		int r;
		//System.out.println(r);	//CE: variable r might not have been initialized 
		
		r = 90;
		System.out.println(r);
		
		System.out.println(a);	//Class level variables contains a default value, we 
		                        //can read them without initializing 		
	}
	
	static int a;
}

