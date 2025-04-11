package com.method;
class BankAccount {

	private long accNum;
	private String accHName;
	private double balance;

	void deposit(double amt){
		System.out.println("\ndeposit() method is called");		
		balance = balance + amt;
		alert(amt, "credited to");
	}

	void withdraw(double amt){
		System.out.println("\nwithdraw() method is called");		
		balance = balance - amt;
		alert(amt, "debited from");
	}

	void currentBalance(){
		System.out.println(balance);
	}

	private void alert(double amt, String action){

		System.out.println("alert() method is called");		
		System.out.println(" "+amt + " is "+ action + " your account ");		
		System.out.println(" Available balanace is " + balance);		
	}
	
	void display(){
		System.out.println("  accNum\t: "  + accNum );
		System.out.println("  accHName\t: "  + accHName );
		System.out.println("  balance\t: " + balance );
	}

}