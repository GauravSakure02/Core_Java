package object2;
class Test05 {
	static void m1() {
		Example e = new Example();
	}
	static void m2() {
		Example e = new Example();
	}
	public static void main(String[] args) {
		m1();
		System.out.println();
		System.gc();
		try{Thread.sleep(1000);	}
		catch(Exception e){	}
	}
}