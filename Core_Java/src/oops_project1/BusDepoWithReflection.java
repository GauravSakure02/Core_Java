package oops_project1;

import java.util.Scanner;

class BusDepoWithReflection {

	public static void main(String[] args) 
							throws ClassNotFoundException, 
									InstantiationException, 
									IllegalAccessException {

		Driver hk = new Driver();
		//hk.drive( new RedBus() );
		//hk.drive( new Volvo() );
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Vehicle Name: ");
		String vehicleName = scn.next();

		//Reflection API
		Class cls = Class.forName(vehicleName);	//loading given class into JVM
		Object obj = cls.newInstance();			//instantiating loaded class 
		
		//type casting the loaded class object to its super class type
		if(obj instanceof Vehicle) {
			Vehicle vehicle = (Vehicle)obj;
			
			hk.drive(vehicle); //passing object as argument to drive() method
		}else {
			System.out.println(vehicleName + " is not a vehicle");
		}
		
	}
}
