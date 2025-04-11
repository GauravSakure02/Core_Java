package java8;
interface I5 {
	private static void m1() {
		System.out.print("Hi ");
	}
	
	private void m2() {
		System.out.print("Hello ");
	}
	
	public static void m3() {
		m1();
		System.out.println("m3");
	}
	
	public static void m4() {
		m1();
		System.out.println("m4");
	}
	
	public static void m5() {
		m1();
		System.out.println("m5");
	}

	public default void m6() {
		m2();
		System.out.println("m6");
	}
	
	public default void m7() {
		m2();
		System.out.println("m7");
	}
	
	public default void m8() {
		m2();
		System.out.println("m8");
	}
	
}