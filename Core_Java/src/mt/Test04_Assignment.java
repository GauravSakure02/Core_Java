package mt;

class PrintNumbersThread extends Thread {
	@Override
	public void run() {
		//task #2
		for(int i=20; i>=1; i--) {
			System.out.println("run  i: "+ i);
		}
	}
}
public class Test04_Assignment {
	public static void main(String[] args) {
		PrintNumbersThread pnt = new PrintNumbersThread();
		pnt.start();
		
		//task #1
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}
	}
}