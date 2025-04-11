package threadstate;
class PrintOddEven {
	
	private boolean printed;
	
	public synchronized void printOdd(int num) {
		if(printed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print( num + " ");
		printed = true;
		
		notify();
	}

	public synchronized void printEven(int num) {
		if(!printed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(num + " ");
		printed = false;
		
		notify();
		
	}
}

class OddNumberRunanble implements Runnable {
	PrintOddEven poe;
	
	public OddNumberRunanble(PrintOddEven poe) {
		this.poe = poe;
	}

	@Override
	public void run() {
		for(int i=1; i<=20; i=i+2) {
			poe.printOdd(i);
		}
	}
}

class EvenNumberRunanble implements Runnable {
	PrintOddEven poe;
	
	public EvenNumberRunanble(PrintOddEven poe) {
		this.poe = poe;
	}
	
	@Override
	public void run() {
		for(int i=2; i<=20; i=i+2) {
			poe.printEven(i);
		}
	}
}


public class Test40_ITC_OddEven {
	public static void main(String[] args) {
		PrintOddEven poe = new PrintOddEven();
		
		Thread th1 = new Thread(new OddNumberRunanble(poe));
		Thread th2 = new Thread(new EvenNumberRunanble(poe));
		
		th1.start();
		th2.start();
	}
}