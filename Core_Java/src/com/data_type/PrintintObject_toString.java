package com.data_type;
class PrintintObject_toString {
	public static void main(String[] args) throws java.io.IOException{

		int p = 50; 
		System.out.println(p); //50
					//directly value printed toString() is not called
						//because it is not object of any class
					
		Example e1 = new Example();
		System.out.println(e1); //Example@1010
					//println() method calls e1.toString(); 
						//because it is not overridden in class Example
						//it is executed from super class java.lang.Object class
						//and return classname@hashCode -> Example@1010

		String s1 = new String("GS");		
		System.out.println(s1); //HK
					//println() method calls s1.toString(); 
						//-> it is overridden in String class 
						//-> is executed from class String
						//-> and returns and prints this object's data HK 
		
		Sample sa = new Sample();		
		System.out.println(sa);	//Hello
					//toString() method is overridden in class Sample
					//by returning "Hello" directly
		
		Xyz xy = new Xyz();		
		System.out.println("xy: "+ xy);
					//toString() method is overridden in class Xyz
					//by returning this object data (x and y values)
					
					
		StringBuilder sb = new StringBuilder("Hari");			
		System.out.println(sb);
		
		java.io.File file = new java.io.File("abc.txt");
		System.out.println(file);
		
		java.io.FileOutputStream fos = new java.io.FileOutputStream("abc.txt");
		System.out.println(fos);
		
		java.util.ArrayList al = new java.util.ArrayList(10);
		al.add(5);
		System.out.println(al);
	}
}