package com.method;
class Sample extends Example { //creating sub class
	
	void m1() {	//implementing Example class's AM in sub class (Mandatory)
		System.out.println("AM m1() is executed from sub class Sample");
	}
	
	void m2() { //overriding super class method in sub class (optional)
		System.out.println("CM m2() is executed from sub class Sample");
	}
}