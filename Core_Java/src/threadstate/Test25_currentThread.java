package threadstate;
public class Test25_currentThread {
	public static void main(String[] args) {
		
		Thread th1 = Thread.currentThread();
		
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		System.out.println();
		
		th1.setName("xyz-main");
		th1.setPriority(9);
		
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		System.out.println();
		
//		Abc.m1();
		
		MyThread18 mt1 = new MyThread18();
//		mt1.start();
		
//		mt1.run();
		System.out.println();
		
		MyThread19 mt2 = new MyThread19();
//		mt2.start(); //-> run() method is loaded and executed in CT 		
						//-> CTO -> Thread-1
						//-> CRTO -> Thread-1
		
//		mt2.run(); 	//-> run() method is now loaded and executed in main thread	
						//-> CTO 	-> Thread-1
						//-> CRTO 	-> main
		
		MyRunnable19 mr = new MyRunnable19();
		mr.run();		//CRTO -> main
		
		Thread th2 = new Thread(mr);
		th2.run();		//CRTO -> main
		th2.start();	//CRTO -> Thread-0
		
	}
}

class Abc {
	
	static void m1() {
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		if(name.contains("main"))
			System.out.println("Hi");
		
		else if(name.contains("Thread")) 
			System.out.println("Hello");	
	}
}
class MyThread18 extends Thread {
	@Override
	public void run() {
		Abc.m1();
	}
}

class MyThread19 extends Thread {
	@Override
	public void run() {
		System.out.println(this.getName());						//CTO name
		System.out.println(Thread.currentThread().getName());	//CRT object name
	}
}

class MyRunnable19 implements Runnable {
	@Override
	public void run() {
		//System.out.println(this.getName());					//CE: 
		System.out.println(Thread.currentThread().getName());	//CRT object name
		
	}
}
