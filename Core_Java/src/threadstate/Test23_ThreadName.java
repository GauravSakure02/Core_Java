package threadstate;
class MyThread17 extends Thread {
	@Override
	public void run() {						

		for(int i=1; i<=10; i++) {
			System.out.println(getName()+" run i: "+ i);
		}
	}
}
public class Test23_ThreadName {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		Thread th2 = new Thread("Child2");
		
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println();
		
		th1.setName("Child1");

		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println();
		
		Thread th3 = new Thread("Worker");
		Thread th4 = new Thread("Worker");
		
		System.out.println(th3.getName());
		System.out.println(th4.getName());
		
		MyThread17 mt1 = new MyThread17();
		MyThread17 mt2 = new MyThread17();
		mt1.setName("Driver");
		mt2.setName("Driver");
		
		mt1.start();
		mt2.start();
		
	}
}
