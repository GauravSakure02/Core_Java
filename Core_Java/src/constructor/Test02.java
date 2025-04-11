package constructor;
class Test02 {
	public static void main(String[] args) {
		Example e1 = new Example();				
		e1.display();

		Example e2 = new Example(15, 16);	
		e2.display();

		System.out.println();

		e2.x = 45;
		e2.y = 55;

		Example e3 = new Example(e2);		
		e2.display();								
		e3.display();								
		System.out.println(e2 == e3);	
		System.out.println();
		
		Example e4 = e2;						
		e2.display();								
		e4.display();								
		System.out.println(e2 == e4); 

/**/
	}
}