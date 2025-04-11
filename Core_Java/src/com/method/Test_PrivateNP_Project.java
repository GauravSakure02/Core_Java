package com.method;
class Test_PrivateNP_Project {
	public static void main(String[] args){
		
		BankAccount acc1 = new BankAccount();
		acc1.display();
		
		acc1.deposit(10000);
		acc1.withdraw(3000);
		
		System.out.print("\nacc1 balance: ");
		acc1.currentBalance();

	}
}