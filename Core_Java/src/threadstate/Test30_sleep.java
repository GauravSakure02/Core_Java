package threadstate;
class MyThread24 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed");
	}
}
public class Test30_sleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread24 mt1 = new MyThread24();
		mt1.start();

		Thread.sleep(5000); //forcing Thread Scheduler to pause this CRT main thread for the given time 
							//and allow other thread to execute
		System.out.println("main end");
	}
}