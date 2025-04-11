package threadstate;
class Thread7 extends Thread {
	private Thread8 th8;
	
	public void setThread8(Thread8 th8) {
		this.th8 = th8;
	}
	
	@Override
	public void run() {
		System.out.println("th7 start");
		System.out.println("th7 before th8.join call");
		System.out.println("th7 is paused for th8 to complete");
		
		try {
			th8.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("th7 after th8.join call");
		System.out.println("th7 end");
	}
}

class Thread8 extends Thread {
	private Thread7 th7;
	
	public void setThread7(Thread7 th7) {
		this.th7 = th7;
	}
	
	@Override
	public void run() {
		System.out.println("th8 start");
		System.out.println("th8 before th7.join call");
		System.out.println("th8 is paused for th7 to complete");
		
		try {
			th7.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("th8 after th7.join call");
		System.out.println("th8 end");
	}
	
}

public class Test37_DeadLock_join {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread7 th7 = new Thread7();
		Thread8 th8 = new Thread8();
		
		th7.setThread8(th8);
		th8.setThread7(th7);

		th7.start();
		th8.start();

		System.out.println("main end");
	}
}