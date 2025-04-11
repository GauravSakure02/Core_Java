package mt;
class MyThread7 extends Thread {
	@Override
	public void run() {
		System.out.println("run  start");
		
		for(int i=1; i<=20; i++) {
			System.out.println("run  i: "+ i);
		}

		System.out.println("run end");
	}
}

public class Test12_startCall_MultipleTimes {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread7 mt1 = new MyThread7();
		mt1.start();
		//mt1.start(); //no CE, RE: ITSE
		
		MyThread7 mt2 = new MyThread7();
		mt2.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}

		System.out.println("main end");
	}
}