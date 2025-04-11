package object2;
class Test07 {
	Example e ;
	void m1(){
		e = new Example();
	}
	void m2(){
		Example e = new Example();
	}
	public static void main(String[] args) {
		Test07 t1 = new Test07();
		t1.m1();
		t1.m1();
		t1.e = null;

		System.out.println();
		System.gc();
		try{Thread.sleep(1000);	}
		catch(Exception e){	}
	}
}