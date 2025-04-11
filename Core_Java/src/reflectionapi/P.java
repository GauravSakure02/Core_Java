package reflectionapi;
class P {
	private int x = 10;

	private P(){ 
		System.out.println("WOW!!! you accessed & executed private constructor");
	}

	private void m1(){ 
		System.out.println("OMG!!! you executed private method :-) "); 
	}
}