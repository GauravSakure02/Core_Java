package com.variable;
//College.java
class College {
	public static void main(String[] args) {
		
			//creating Student class object
			Student s1 = new Student();	//Student class's CL all variables are 
										//provided memory with default values
										//based on their data type	
										
			//printing object's default values
			s1.display();				
			
			//initializing CLVs in this Student object s1
			s1.instituteName	= "Naresh i Technologies";
			s1.instituteAddress = new Address(); //Address class's all CLV 
												 //are provided memory with DVs
			s1.instituteAddress.strnum	= 1;
			s1.instituteAddress.city	= "Hyd";
			
			s1.sno				= 101;
			s1.sname			= "GS";
			s1.studentAddress	= new Address();//Address class's all CLV 
												//are provided memory with DVs
			s1.studentAddress.strnum	= 5;
			s1.studentAddress.city		= "Sec";
		
			//intializing marks
			s1.tM	= 85;
			s1.hM	= 69;
			s1.eM	= 100;
			s1.mM	= 100;
			s1.sciM	= 90;
			s1.socM	= 80;
			
			System.out.println();
			
			//printing object initiailzed values
			s1.display();				
			
	}
}

