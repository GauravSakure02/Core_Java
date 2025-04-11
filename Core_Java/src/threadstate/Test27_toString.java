package threadstate;
public class Test27_toString {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println(th1);
					//obj.toString() method returned string is printed
						//if toString() method is not overridden in this printing object
						//  this object's CN@hashcode in hexa string format is printed
	
						//if toString() method is overridden in this printing object
						//  this object's state is printed
		
		Thread th2 = new Thread("Child2");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		th3.setPriority(7);
		
		Thread th4 = new Thread();
		System.out.println(th4);
		
		
	}
}
