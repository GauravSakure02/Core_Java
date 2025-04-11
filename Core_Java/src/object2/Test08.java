package object2;
class Test08 {
	Example e;
	void m1(){
		e = new Example();
	}
	void m2(){
		Example e = new Example();
	}
	public static void main(String[] args) {
		Test08 t1 = new Test08();	t1.m1();		
		Test08 t2 = new Test08();	t2.m1();		
		Test08 t3 = new Test08();	t3.m1();		

		System.out.println();
		System.gc();
		try{	Thread.sleep(1000);	}
		catch(Exception e){	}
	}
	Test08(){
		System.out.println("Test constructor "+ this);
	}
}
