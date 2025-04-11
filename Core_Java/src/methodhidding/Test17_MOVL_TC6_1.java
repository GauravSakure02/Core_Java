package methodhidding;
/*class Example{}
class Sample extends Example{}*/
/*
class A{
	void m1(Test17_MOVL_TC6_1 e){				
	    System.out.println("Example param");		
	}												
													
	void m1(Sample s){				
	    System.out.println("Sample param");		
	}						
}*/

class Test17_MOVL_TC6_1{
	public static void main(String[] args){   													
		A a = new A();                                      													
//		a.m1(new Test17_MOVL_TC6_1());	                      													
//		a.m1(new Sample());                          													
//		a.m1(null);   /* 
		
		System.out.println();                													
//		a.m1("abc");                                        
                                                     				
		Example e1 = new Example(); 		
		Example e2 = new Sample();			     
		Sample   s1  = new Sample();			      
		Example e3 = null;				              
		Sample   s2  = null;			                  
                                                                     
//		a.m1(e1);	
//		a.m1(e2);		
		a.m1(s1);   
		System.out.println();   
//		a.m1(e3);	
		a.m1(s2);                              
		System.out.println();   
//		a.m1(null);	                         
		a.m1(new Sample());	                         
/**/
	}                                                                
}