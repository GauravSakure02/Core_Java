package com.method;

class Ex1{
	int x = 10;
	
	void m1() {
		int  x = 50;
		System.out.println(x);
		System.out.println(this.x);
		x = 60;
		this.x = 70;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		
		Ex1 e1 = new Ex1();
		e1.m1();

	}
}