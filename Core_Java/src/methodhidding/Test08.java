package methodhidding;

interface Example {

	int x = 10;
	void m1();
	class A {}

	default void m2(){ }
	static void m3() { }

	private static void m4(){ }
	private        void m5(){ }

		//+ 

	//static { }
	//{ }
	//Example(){ }
		//+ 

	//int y;

		//+
	//private int a = 10;
	int b = 20;
	//protected int c = 30;
	public int d = 40;
		//+	
}

//class Sample implements Example {  }

/*
class Sample implements Example {  
	void m1(){ }
}
*/

class Sample implements Example {
	public void m1() {
		System.out.println("m1 is executed from class Sample");
	}
}



public class Test08{
	public static void main(String[] args) {
		Example e1;

		//e1 = new Example();

		e1 = new Sample();
		e1.m1();
	}
}