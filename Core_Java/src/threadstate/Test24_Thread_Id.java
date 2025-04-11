package threadstate;
public class Test24_Thread_Id {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		
		System.out.println(th1.getName() + " " + th1.getId() + " " + th1.threadId());
		System.out.println(th2.getName() + " " + th2.getId() + " " + th2.threadId());
		
	}
}

