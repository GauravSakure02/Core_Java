package methodhidding;
class Alpha{}
interface Foo {}
class Beta extends Alpha implements Foo{}

class  Test17_MOVL_TC6_5{
	
	static void m1(Alpha obj){ 
		System.out.println("Alpha param");
	}
	
	static void m1(Foo i1){ 
		System.out.println("Foo param");
	}

	public static void main(String[] args) {
//		m1(new Beta());
//		m1(null);

		Alpha a1 = new Beta();
		m1(a1);

		Foo f1 = new Beta();
		m1(f1);

		m1((Alpha) new Beta());
		m1((Foo) new Beta());
	}
}