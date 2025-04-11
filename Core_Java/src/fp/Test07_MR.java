package fp;
public class Test07_MR {
	public static void main(String[] args) {
		
		Abc1 a1 = () -> { System.out.println("LE Hi"); };
		a1.abc();
		
	//======================================================================	
		Abc1 a2 = () -> { A1.m1(); };
		a2.abc();
		
		Abc1 a3 = A1::m1; 	//method reference is short-cut LE creation
		a3.abc();
	//======================================================================	
		
		Abc2 a4 = a -> A1.m1(a);
		a4.abc(10);
		
		Abc2 a5 = A1::m1;
		a5.abc(20);
		System.out.println();
	//======================================================================	
		
		Abc1 a6 = () -> new A1().m2();
		a6.abc();
		
		Abc1 a7 = new A1()::m2;
		a7.abc();
		
	//======================================================================	
	
		Abc2 a8 = a -> new A1().m2(a);
		a8.abc(123);
		
		Abc2 a9 = new A1()::m2;
		a9.abc(223);
		System.out.println();
		
	//======================================================================
		
		Abc1 a10 = () -> { new A1(); };
		a10.abc();
		
		Abc2 a11 = (int a) -> { new A1(a); };
		a11.abc(5656);
		System.out.println();
		
	//======================================================================
		Abc1 a12 =  A1::new;
		a12.abc();
		
		Abc2 a13 = A1::new;
		a13.abc(2345);
		System.out.println();
	//=====================================================================
		Abc2 a14 = (a) -> { System.out.println(a); };
		a14.abc(45);
	
		Abc2 a15 = System.out::println; 
		a15.abc(55);

/**/		
	}
}