package fp;
public class Test06_LE {
	public static void main(String[] args) {
		
		//A LE is an implementation of a FI
		//hence we can not write a LE directly as below
		//it leads CE
			//(a, b) -> System.out.println(a + b);
		
		//First we must create a FI
		//to implement this FI, we must use LE
		
		I11 i1 = () -> { System.out.println("I11 LE"); }; //function creation
		i1.m1();  //calling 
		
		I12 i2 = (int a) -> { System.out.println("I12 LE a: "+ a); }; //creation
		i2.m1(10); //calling
		i2.m1(20);
		
		I13 i3 = (int a, int b) -> { System.out.println("I13 LE result: "+ (a + b));}; 
		i3.m1(10, 20);
		i3.m1(30, 40);
		
		
		I14 i4 = () -> {
							System.out.println("I14 LE");
							return 10; 
					   };
		i4.m1();				
		int res = i4.m1();
		System.out.println(res);
		System.out.println(i4.m1());
		
		
		I15 i5 = (int a) -> {
								System.out.println("I15 LE:");
								return a + 50;
							};
		i5.m1(10);					
		res = i5.m1(20);
		System.out.println(res);
		System.out.println(i5.m1(30));					
		System.out.println();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
  //======================================================================
		I11 i11  = () -> { System.out.println("LE1"); };	
		I11 i111 = () ->   System.out.println("LE1"); 
		
		I12 i12  = (int a) -> { System.out.println("LE2");};
		I12 i121 = (int a) ->   System.out.println("LE2");
		I12 i122 = (a)     ->   System.out.println("LE2");
		I12 i123 = a       ->   System.out.println("LE2");
		
		I13 i13  = (int a, int b) -> { System.out.println("LE3");};
		I13 i131 = (a, b)         ->   System.out.println("LE3");
		
		I14 i14  = () -> { return 50; };
		I14 i141 = () ->   50;
		I14 i142 = () ->   50 + 60;
		I14 i143 = () ->   "abc".length();
		
		I15 i15 = (int a) -> {return a + 50;}; 
		I15 i151 = a      ->  a + 50;
		System.out.println("LE151 res: " + i151.m1(70));
  //=======================================================================		
/**/		
	}
}