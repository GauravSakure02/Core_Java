package mt;
class PrintNumbersRunnable implements Runnable{
	@Override
	public void run() {
		//task #2
		for(int i=20; i>=1; i--) {
			System.out.println("run  i: "+ i);
		}
	}
}
public class Test05_Assignment {
	public static void main(String[] args) {
		PrintNumbersRunnable pnr = new PrintNumbersRunnable();
		Thread th1 = new Thread(pnr);
		th1.start();
		
		//task #1
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}
	}
}