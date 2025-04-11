package fp;

class A1 {
	static void m1() {
		System.out.println("A1 m1() Hi");
	}
	
	static void m1(int a) {
		System.out.println("A1 m1(int) "+ a);
	}
	
	void m2() {
		System.out.println("A1 m2()");
	}

	void m2(int a) {
		System.out.println("A1 m2(int) a: "+ a);
	}
	
	A1(){
		System.out.println("A1 NPC");
	}
	
	A1(int a){
		System.out.println("A1 IPC a: "+ a);
	}
	
}

@FunctionalInterface
interface Abc1 {
	void abc();
}

@FunctionalInterface
interface Abc2 {
	void abc(int a);
}