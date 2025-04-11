package com.method;
abstract class Example {  //super class
	//1. abstract method
	abstract void m1();	//for declaring and forcing sub classes to implement
	
	//2. concrete method
	void m2() {	//for defining and allowing sub classes to reuse or override
		System.out.println(
		     "CM m2() method is executed from super class Example");
	}
}