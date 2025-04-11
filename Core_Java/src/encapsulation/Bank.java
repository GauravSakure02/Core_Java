package encapsulation;
import java.util.Scanner;
class Bank{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		BankAccount acc1 = new BankAccount();
		try{
			System.out.print("Enter balance: ");
			acc1.setBalance(scn.nextDouble());

			System.out.println("Current Balance: "+ acc1.getBalance());

		}catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}