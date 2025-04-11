package mt;
class MyThread9 extends Thread {
	
	private int x;
	
	public MyThread9(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " run  start");
		
		for(int i=1; i<=x; i++) {
			System.out.println(name +" run  i: "+ i);
		}

		System.out.println(name + " run end");
	}
}
public class Test14_MCTs_SCMis_diffvalues {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread9 mt1 = new MyThread9(10);
		mt1.start();

		MyThread9 mt2 = new MyThread9(15);
		mt2.start();
		
		System.out.println("main end");
	}
}