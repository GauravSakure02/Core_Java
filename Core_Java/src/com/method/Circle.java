package com.method;
class Circle implements Shape{
	static final double PI = 3.14;
	double r;
	public void findArea(){
		System.out.println("Circle area: "+ (PI * r * r)) ;
	}
}