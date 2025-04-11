package mt;
public class Test16_CT_from_CT {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread10 mt1 = new MyThread10();
		mt1.start();
		System.out.println("main end");
	}
}

class MyThread10 extends Thread {
	@Override
	public void run() {
		System.out.println("MT10 run start");
		MyThread11 mt2 = new MyThread11();
		mt2.start();
		System.out.println("MT10 run end");
	}	
}

class MyThread11 extends Thread {
	@Override
	public void run() {
		System.out.println("MT11 run start");
		
		System.out.println("MT11 run end");

	
	}
}
