package mt;
public class Test03_MyRunnable {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyRunnable mr = new MyRunnable();
		//mr.start(); //CE: c f s start() in MyRunnable class
		
		Thread th1 = new Thread(mr); 
		th1.start();
		
		System.out.println("main end");
	}	
}