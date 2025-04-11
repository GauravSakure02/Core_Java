package mt;
class MyThread6 extends Thread {
	@Override
	public void run() {
		System.out.println("run  start");
		
		for(int i=1; i<=20; i++) {
			System.out.println("run  i: "+ i);
		}

		System.out.println("run end");
	}
}
public class Test11_startRunCall {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread6 mt1 = new MyThread6();
		mt1.start();
		mt1.run();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}

		System.out.println("main end");
	}
}