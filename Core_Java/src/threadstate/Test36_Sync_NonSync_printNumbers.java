package threadstate;
class PrintNumbers {
	synchronized void print1To20() {
		for(int i=1; i<=20; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

	//synchronized void print21To40() {
	void print21To40() {
		for(int i=21; i<=40; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}

class Print1To20Thread extends Thread {
	private PrintNumbers pn;
	
	public Print1To20Thread(PrintNumbers pn) {
		this.pn = pn;
	}
	
	@Override
	public void run() {
		pn.print1To20();
	}
}

class Print21To40Thread extends Thread {
	private PrintNumbers pn;
	
	public Print21To40Thread(PrintNumbers pn) {
		this.pn = pn;
	}
	

	@Override
	public void run() {
		pn.print21To40();
	}
}
public class Test36_Sync_NonSync_printNumbers {
	public static void main(String[] args) {
		
		PrintNumbers pn = new PrintNumbers();
		
		Print1To20Thread pt1 = new Print1To20Thread(pn);
		Print21To40Thread pt2 = new Print21To40Thread(pn);
		
		pt1.start();
		pt2.start();
		
	} 
}