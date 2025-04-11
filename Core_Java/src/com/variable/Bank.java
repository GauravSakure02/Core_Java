package com.variable;
//Bank.java
class Bank { //executable class
	public static void main(String[] args) 	{
		
		//Initializing static fields common all accounts
		BankAccount.bankName	= "HKBank";
		BankAccount.branchName	= "Ameerpet";
		BankAccount.ifsc		= "HK123AM";
		
		//Creating two instances from BankAccount class 
		BankAccount acc1  = new BankAccount(); //for HK
		BankAccount acc2  = new BankAccount(); //for BK

		//Initializing acc1 instance variable with HK values
		acc1.accNum		 = 123423453456L;	
		acc1.accHName	 = "GS";	
		acc1.balance	 = 9999999;	

		//initializing acc2 instance variable with BK values
		acc2.accNum		 = 123423453457L;	
		acc2.accHName	 = "PZ";	
		acc2.balance	 = 99999999;	

		System.out.println("acc1 details");
		System.out.println("  acc1.bankName\t\t: "	+ acc1.bankName);
		System.out.println("  acc1.branchName\t: "	+ acc1.branchName);
		System.out.println("  acc1.ifsc\t\t: "		+ acc1.ifsc);
		System.out.println("  acc1.accNum\t\t: "	+ acc1.accNum);
		System.out.println("  acc1.accHName\t\t: "	+ acc1.accHName);
		System.out.println("  acc1.balance\t\t: "	+ acc1.balance);
		
		System.out.println("\nacc2 details");
		System.out.println("  acc2.bankName\t\t: "	+ acc2.bankName);
		System.out.println("  acc2.branchName\t: "	+ acc2.branchName);
		System.out.println("  acc2.ifsc\t\t: "		+ acc2.ifsc);
		System.out.println("  acc2.accNum\t\t: "	+ acc2.accNum);
		System.out.println("  acc2.accHName\t\t: "	+ acc2.accHName);
		System.out.println("  acc2.balance\t\t: "	+ acc2.balance);
	}
}