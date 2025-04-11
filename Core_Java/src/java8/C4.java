package java8;
class C4 implements I1 {
	@Override
	public void m1() {
		System.out.println("m1 is executed from class C4");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 is executed from class C4");
	}
	
	@Override
	public void m3() {
		I1.super.m3();
		System.out.println("m3 is executed from class C4");
		I1.super.m3();
	}
}