package java8;
interface I1 {
	public abstract void m1();
	public abstract void m2();
	
	public default void m3() { 
		System.out.println("m3 is executed from interface I1 for "+ this + " object");
	}
}
