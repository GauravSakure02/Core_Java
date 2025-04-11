package methodhidding;

/*
class Example {
 	void add(int a , int b)	{
		System.out.println("Example int, int");
	}	

 	void add(String a, float b) {
		System.out.println("Example String, float");
	}

 	int add(String s1 , String s2)	{
		System.out.println("Example String, String");
		return 10;	
	}
}
/*
class Sample extends Example{
 	void add(int x , int y)  	{
		System.out.println("Sample int, int");
	}	
 	float add(float a , int b){
		System.out.println("Sample float, int");
		return a + b; 
	}

 	String add(String s1 , double d){
		System.out.println("Sample String, double");
		return s1 + d;	
	}
}*/
class Test17_MOVL_TC7{
	public static void main(String[] args)	{
		Sample s = new Sample();
		s.add(10, 20);				
		s.add("abc", 20);			
		s.add("abc", "xyz");		
		s.add("10", 20.0);				
//		s.add(10, 20.0f);			
		System.out.println();

		Example e = new Sample();
		e.add(10, 20);				
		e.add("abc", 20);			
		e.add("abc", "xyz");			
			

	}
}

