package mt;
class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("run  start");
		
		for(int i=1; i<=20; i++) {
			System.out.println("run  i: "+ i);
		}

		System.out.println("run end");
	}
}
public class Test08_MTMA {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread3 mt1 = new MyThread3();
		mt1.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}

		System.out.println("main end");
	}
}