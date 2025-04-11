package threadstate;
class DisplayNumbers2{
	void print1To20() {
	//synchronized void print1To20() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");

		for(int i=1; i<=20; i++) {
			System.out.println(name + " run i: "+ i);
		}
		
		synchronized(this) {
			for(int i=30; i<=50; i++) {
				System.out.println(name + " run i: "+ i);
			}
		}
		
		
		System.out.println(name + " end");
	}
	
}

class PrintSycnBlockThread1 extends Thread {
	private DisplayNumbers2 dn;
	
	public PrintSycnBlockThread1(DisplayNumbers2 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		 dn.print1To20(); 
	}
}

class PrintSyncBlockThread2 extends Thread {
	
	private DisplayNumbers2 dn;
	
	public PrintSyncBlockThread2(DisplayNumbers2 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		dn.print1To20(); 
	}
}
public class Test35_SynchronizedBlock {
	public static void main(String[] args) {
		DisplayNumbers2 dn = new DisplayNumbers2();
		
		PrintSycnBlockThread1 pt1 = new PrintSycnBlockThread1(dn);
		PrintSyncBlockThread2 pt2 = new PrintSyncBlockThread2(dn);
		
		pt1.start();
		pt2.start();
		
	}
}