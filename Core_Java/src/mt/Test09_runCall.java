package mt;
class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("run  start");
		
		for(int i=1; i<=20; i++) {
			System.out.println("run  i: "+ i);
		}

		System.out.println("run end");
	}
}
public class Test09_runCall {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread4 mt1 = new MyThread4();
		mt1.run();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}

		System.out.println("main end");
	}
}