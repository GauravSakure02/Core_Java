package methodhidding;
interface I1 {}
interface I2 {}
/*
class C implements I1, I2{}

class  Test17_MOVL_TC6_4{
	
	static void m1(I1 i1){ 
		System.out.println("I1 param");
	}
	
	static void m1(I2 i2){ 
		System.out.println("I2 param");
	}
	
		*/
	public static void main(String[] args) {
		//m1(new C());
		//m1(null);

		I1 i1 = new C();
		m1(i1);

		I2 i2 = new C();
		m1(i2);

		m1((I1) new C());
		m1((I2) new C());
	}
}