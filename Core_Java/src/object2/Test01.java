package object2;
class Test01 {
	public static void main(String[] args) {
		Example e1 = new Example();

		new Example();

		e1 = new Example();

		e1 = null;
		
		System.out.println();
		System.gc(); //Requesting JVM to run gc

		try{Thread.sleep(100);}//pausing main method execution to all gc to run
		catch(Exception e){ }

	}
}