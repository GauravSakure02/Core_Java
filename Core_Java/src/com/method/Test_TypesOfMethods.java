package com.method;
class Test_TypesOfMethods { //creating user class

	public static void main(String[] args) {
		System.out.println("main start\n");
		
			//Example e1 = new Example(); //creating super class object
						//CE: Example is abstract; cannot be instantiated
						
			Example e1 = new Sample();	//creating sub class object
			
			e1.m1();	//reusing super class AM 
							//it is always executed from sub class
							
			e1.m2();	//reusing super class CM
							//it may be executed from 
								//sub class Sample or 
								//super class Example if not overridden	
			
		System.out.println("\nmain end");
	}
}