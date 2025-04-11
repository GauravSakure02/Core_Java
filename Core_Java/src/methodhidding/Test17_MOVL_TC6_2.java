package methodhidding;


class Test{}

class A{
	void m1(Example e){				
	    System.out.println("Example param");		
	}												
													
	void m1(Test s){				
	    System.out.println("Test param");		
	}						
}
class Test17_MOVL_TC6_2{
	public static void main(String[] args){   													
		A a = new A();               
		a.m1(new Example());	                      													
		a.m1(new Sample());                           													
		a.m1(new Test());                                           												
		//a.m1(null);      	
		
		a.m1((Sample)null);	
		a.m1((Test)null);                              
                                                                      													
		//a.m1("abc");  
		
/**/
	}                                                                
}    