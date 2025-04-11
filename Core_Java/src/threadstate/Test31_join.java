package threadstate;
class MyThread25 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("run end");
	}
}
public class Test31_join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread25 mt = new MyThread25();
		mt.start();
		
		//mt.join();
		//mt.join(3000);
		//mt.join(10000);
		mt.sleep(10000);
		
		System.out.println("main end");
	}
}