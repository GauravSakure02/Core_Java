package encapsulation;
class BankAccount{

	private double balance;

	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance <= 0)
			throw new IllegalArgumentException("Donot pass -ve balance");

		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}
}