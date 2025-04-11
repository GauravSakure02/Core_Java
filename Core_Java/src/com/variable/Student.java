package com.variable;
//Student.java
class Student {
	
	String instituteName;
	Address instituteAddress;
	
	int sno;
	String sname;
	Address studentAddress;
	
	double tM, hM, eM, mM, sciM, socM;
	
	void findTotalMarksAndPercentage() {
		 double total = tM + hM + eM + mM + sciM + socM;
		 double perc  = total/6;
		 
		 System.out.println("   Total Marks\t\t: " + total);
		 System.out.println("   Percentage\t\t: " + perc);
	}
	
	void display() {
		System.out.println("   instituteName\t: "	+ instituteName);
		System.out.println("   instituteAddress\t: "+ instituteAddress);
		System.out.println("   sno\t\t\t: "			+ sno);
		System.out.println("   sname\t\t: "			+ sname);
		System.out.println("   studentAddress\t: "	+ studentAddress);
		System.out.println("   Student Marks\t: "	+ tM +", "+ hM+", "+ eM+", "+ 
														mM+", "+ sciM+", "+ socM);
//		System.out.println("   total Marks: "		+ total);
//		System.out.println("   percentage : "		+ perc);

		findTotalMarksAndPercentage();
	}
	
}//class Student close