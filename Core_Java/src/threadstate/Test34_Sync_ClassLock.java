package threadstate;
class Addition3 {
	
	private static int x;
	private static int y;
	
	//static void add(int x, int y) {
	static synchronized void add(int x, int y) {
		Addition3.x = x;
		Addition3.y = y;
		
		try { Thread.sleep(2000);}
		catch(InterruptedException e) {}
		
		int res = Addition3.x + Addition3.y;
		System.out.println(Thread.currentThread().getName() + " res: "+ res);
	}
}

class Thread5 extends Thread {
	
	@Override
	public void run() {
		Addition3.add(50, 60);
	}
}

class Thread6 extends Thread {
		
	@Override
	public void run() {
		Addition3.add(70, 80);	
	}
}

public class Test34_Sync_ClassLock {
	
	public static void main(String[] args) {
		
		
		Thread5 th1 = new Thread5();
		Thread6 th2 = new Thread6();

		th1.start();
		th2.start();
		
	}
}