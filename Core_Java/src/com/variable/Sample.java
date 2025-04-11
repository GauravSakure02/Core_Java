package com.variable;
class Sample {
	static void m3(int p) {
		int q = 60;
		
		System.out.println("m3 is executed");
		System.out.println("  p: "+ p);
		System.out.println("  q: "+ q);
	}
	
	static void m4() {
//		System.out.println("  p: "+ p);	//CE: c f s p in class Sample
//		System.out.println("  q: "+ q); //CE: c f s q in class Sample
	}
}