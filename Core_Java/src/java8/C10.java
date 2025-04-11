package java8;
class C10 implements I4 {
	static void m1() { //it is not interface overriding method
						//it is C7 class own method, observe we did not add public
	}
	
	
//	void m2() { } //CE: because public is missing
					//this method the interface default method's overriding method 
}