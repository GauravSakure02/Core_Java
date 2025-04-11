package com.method;
class Driver {
	public static void main(String[] args) {
		Bus bus;

		bus = new RedBus();			
		bus.breaks();				
			//executed from class Bus, 
			//becuase it is not overridden in class RedBus 						

		bus = new Volvo();			
		bus.breaks();				
			//executed from class Volvo
			//because it is overridden in class Volvo
	}
}
