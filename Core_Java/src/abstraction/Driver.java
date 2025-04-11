package abstraction;
class Driver {
					//Loose Coupling  (accepts all different sub types and allows to change 
	void drive(Vehicle v) {				//one sub type to another sub type without modifying code
		//Runtime Polymorphism			
		v.engine();  //executed from Vehicle implementation classes
		v.breaks();  //based on the runtime object passed as argument
					  //and stored in the method parameter v
	}
}