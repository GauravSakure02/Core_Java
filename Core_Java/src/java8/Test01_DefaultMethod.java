package java8;
public class Test01_DefaultMethod {
	public static void main(String[] args) {
		I1 i1 ;
		
		i1 = new C1();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();
		
		i1 = new C2();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();
		
		i1 = new C3();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();

		i1 = new C4();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();

		C6 c6 = new C6();
		c6.m5();
		
		/**/
	}
}