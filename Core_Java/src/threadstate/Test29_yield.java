package threadstate;
class MyThread23 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed");
	}
}
public class Test29_yield {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread23 mt1 = new MyThread23();
		mt1.start();

		Thread.yield(); //Requesting Thread Scheduler to pause this CRT main thread 
						//and allowing other thread to execute
						//This request many be accepted or may not be accepted
		System.out.println("main end");
	}
}