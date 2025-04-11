package mt;
class MyThread8 extends Thread {
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " run  start");
		
		for(int i=1; i<=20; i++) {
			System.out.println(name +" run  i: "+ i);
		}

		System.out.println(name + " run end");
	}
}

public class Test13_MCTs_ScMIs {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread8 mt1 = new MyThread8();
		mt1.start();

		MyThread8 mt2 = new MyThread8();
		mt2.start();
		
		System.out.println("main end");
	}
}