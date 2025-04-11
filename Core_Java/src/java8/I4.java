package java8;

interface I4 {
	public static void m1() {System.out.println("SM m1 is executed from interface I4 "); }
	public default void m2() {System.out.println("DM m2 is executed from interface I4 "); }
}
