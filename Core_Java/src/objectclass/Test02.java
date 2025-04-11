package objectclass;
class Test02 {
	public static void main(String[] args) {
		Example e1 = new Example();//done
		Example e2 = new Example();//done
		Example e3 = new Example();		
		Example e4 = e3;

		e3 = new Example();

		e2 = e1;
		
		e1 = new Example();

		e2 = null;

		System.gc();
		try{Thread.sleep(1000);	}
		catch(Exception e){	}
	}
}
