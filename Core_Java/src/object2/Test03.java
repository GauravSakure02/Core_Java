package object2;
class Test03 {
	public static void main(String[] args) {
		int a = 10;

		Example e1 = new Example();	
		
		if(a == 10) {
			Example e2 = new Example();	
		}

		if(a != 10) {
			Example e3 = new Example();	
		}
           
		if(true){Example e3 = new Example();}
		if(false){Example e4 = new Example();}
		
		if(true){Example e5 = new Example();}

		{ Example e6 = new Example(); }

		Example e7;
		if(a==10){
			e7 = new Example();
		}

		Example e8 = null;
		if(a==10){
			e8 = new Example();
		}

		System.gc();
		try{Thread.sleep(1000);}
		catch(Exception e){	}
  
	}
}
