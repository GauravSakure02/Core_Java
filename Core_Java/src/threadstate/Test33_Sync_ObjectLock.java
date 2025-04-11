package threadstate;
class Addition2 {
	
	private int x;
	private int y;
	
	synchronized void add(int x, int y) { //object locked [object lock]
		this.x = x;
		this.y = y;
		
		try { Thread.sleep(2000);}
		catch(InterruptedException e) {}
		
		int res = this.x + this.y;
		System.out.println(Thread.currentThread().getName() + " res: "+ res);
	}
}

class Thread3 extends Thread {
	private Addition2 a;
	
	public Thread3(Addition2 a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(50, 60);
	}
}

class Thread4 extends Thread {
	private Addition2 a;
	
	public Thread4(Addition2 a) {
		this.a = a;
	}
		
	@Override
	public void run() {
		a.add(70, 80);	
	}
}
public class Test33_Sync_ObjectLock {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Addition2 a1 = new Addition2();
		
		Thread3 th1 = new Thread3(a1);
		Thread4 th2 = new Thread4(a1);

		th1.start();
		th2.start();
		
		System.out.println("main end");
	}
}