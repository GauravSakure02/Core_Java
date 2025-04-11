package threadstate;

class MyThread14 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		
		System.out.println("In run  S3: "+ getState());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run end");
	}
}
public class Test20_ThreadStates {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread14 mt1 = new MyThread14();
		System.out.println("In main S1: "+ mt1.getState());
		
		mt1.start();
		System.out.println("In main S2: "+ mt1.getState());

		Thread.sleep(1000);
		System.out.println("In main S4: "+ mt1.getState());
		
		Thread.sleep(3000);
		System.out.println("In main S4: "+ mt1.getState());
		
		System.out.println("main end");
	}
}