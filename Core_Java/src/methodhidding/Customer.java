package methodhidding;

//user class accessing super class method for executing it from sub classes
//user class with dynamic binding with sub classes
class Customer {
	public static void main(String[] args) {
		Bank bank;  //super class type ref variable (UC-LC)
		int roi;

		bank = new HDFCBank();//storing sub class object in super class ref var(UC-LC)
		roi = bank.getROI();  //RP(DB) -> executed from Bank class for HDFCBank
		System.out.println(roi);

		bank = new KotakBank(); //LC -> changing to another sub class
		roi = bank.getROI();	//RP(DB)-> executed from KotakBank 
		System.out.println(roi);

		bank = new YesBank(); //storing sub class object in super class ref var(UC-LC)
		roi = bank.getROI();  //RP(DB) -> executed from YesBank class
		System.out.println(roi);
/**/
//==============================================
		printROI(new HDFCBank());
		printROI(new KotakBank());
		printROI(new YesBank());
//===============================================
	}

	static void printROI(Bank bank) { //LC- can accept all bank objects and can change
		int roi = bank.getROI();  //RP(DB) -> executed from passed object Bank class (H/K/Y)
		System.out.println(roi);
	}

	//we achevied OOP 3rd target
		//achieving dynamic binding(connection) between 
		//user object to sub types object in accessing an operation

}