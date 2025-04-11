package threadstate;
class MyThread15 extends Thread {
	@Override
	public void run() {						

		for(int i=1; i<=20; i++) {
			System.out.println("run i: "+ i);
		}
	}
}
public class Test21_ThreadScheduling {
	public static void main(String[] args) {

		MyThread15 mt1 = new MyThread15();
		mt1.start(); 
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}
	}
}