package fp;
public class Test05_FI {
	public static void main(String[] args) {
		
	//Approach #1: OC	
		I111 i1 = new I11Impl();
		i1.m1();
		
	//Approach #2: AIC
		I111 i2 = new I111() {
					@Override
					public void m1() {
						System.out.println("I11: AIC implimenation");
					}
				};
		i2.m1();
		System.out.println(i2);
		
	//Approach #3: LE (anonymous function short-cut of LE)
		I111 i3 = () -> System.out.println("I11: LE implimenation");
		i3.m1();
	
	}
}