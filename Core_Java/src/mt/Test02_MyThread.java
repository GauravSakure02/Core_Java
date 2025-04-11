package mt;
class Test02_MyThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread mt1 = new MyThread();
		mt1.start(); 
					
		System.out.println("main end");
	}
}