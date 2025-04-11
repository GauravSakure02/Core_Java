package oops_project1;

import java.util.Scanner;

class BusDepoWithReflectionAndTryCatch {

	public static void main(String[] args) {
		String vehicleName = null;
		try	{
		
			Driver hk = new Driver();
			//hk.drive( new RedBus() );
			//hk.drive( new Volvo() );
			
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter Vehicle Name: ");
			vehicleName = scn.next();

			//Reflection API
			Class clazz = Class.forName(vehicleName); //loading given class into JVM
			Object obj = clazz.newInstance();		  //instantiating loaded class 	
			
			//checking type of the object
			if(obj instanceof Vehicle v){ //Java 14v : instanceof operator pattern matching   
				//Vehicle v = (Vehicle)obj;
				hk.drive(v);
			} else {
				System.out.println(
					vehicleName + " is not Vehicle type");
			}	

		}catch(ClassNotFoundException | NoClassDefFoundError e){ //Java 7v catch with multiple exceptions
			System.out.println(	"Error: " + vehicleName +".class is not found");

		}catch(InstantiationException e) {
			System.out.println(
			"Error: no-param constructor is not found in " + vehicleName +" class");

		}catch(IllegalAccessException e){ 
			System.out.println(
			"Error: no-param constructor is not visible in " 
				                       + vehicleName +" class");
		}
	}
}