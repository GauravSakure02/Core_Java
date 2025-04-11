package com.data_type;

public class Addition {

	public static void add() {
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println(c);
	}
	
	public static void add(int a, int b) {
		int c = a + b;
	 	//System.out.println(c);
		System.out.println("The addition result is: " + c);
	    }

	public static void main(String[] args) {
		System.out.println("main start");
//		add();
//		add();
//		add();

		add(10, 20);
		add(30, 40);
		add(12330, 5465640);
       System.out.println("main end");

	}

}
