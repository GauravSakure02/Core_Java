package threadstate;
class MyThread16 extends Thread {
	@Override
	public void run() {						

		for(int i=1; i<=50; i++) {
			System.out.println(getName()+" run i: "+ i);
		}
	}
}

public class Test22_ThreadPriority {
	public static void main(String[] args) {

		MyThread16 mt1 = new MyThread16();
		MyThread16 mt2 = new MyThread16();
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println();
		
		mt1.setPriority(9);
		mt2.setPriority(7);

	//	mt2.setPriority(0);		must be in between 1---5----10
	//	mt2.setPriority(11);
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.start(); 
		mt2.start(); 
	}
}