package java8;
class C6 implements I2, I3 { //solution to CE: a e is
							//override default implemented method
	@Override
	public void m5() {
		System.out.println("m5 is executed from class C5");
		I2.super.m5();
		I3.super.m5();
	}
} 
