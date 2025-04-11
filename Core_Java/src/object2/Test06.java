package object2;
class Test06{
	static Example e;
	static void m1(){
		e = new Example();
	}
	static void m2(){
		Example e = new Example();
	}
	public static void main(String[] args) {
		m1();	
		m1();
		e = null;
		System.out.println();
		System.gc();
		try{Thread.sleep(1000);	}
		catch(Exception e){	}
	}
}
