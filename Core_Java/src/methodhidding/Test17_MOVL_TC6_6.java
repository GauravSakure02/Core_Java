package methodhidding;

interface I {}
class C implements I{}
class  Test17_MOVL_TC6_6{

	static void m1(Object obj){ 
		System.out.println("Object param");
	}
	
	static void m1(I i1){ 
		System.out.println("I param");
	}
	static void m1(String s1){ 
		System.out.println("String param");
	}
	public static void main(String[] args) {
		m1(new C());
//		m1(null);

		m1((Object)new C());
		m1((Object)null);

	}
}