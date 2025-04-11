package oops_project2;
public class Airtel implements SIM {  //inheritance

	private double balance;				//encapuslation
	
	@Override
	public void recharge(double amt){		//polymorphism
		this.balance = this.balance + amt;
		System.out.println("Airtel SIM is recharged");
		currentBalance();
	}

	@Override
	public void currentBalance(){
		System.out.println(
			"Airtel SIM balance: "+ balance);
	}

	@Override
	public String call(long mn){
		return "Aritel: The number you are dialing is currently busy."+
			   "\nPlease dial after some time";
	}

	@Override
	public String sms(long mn, String msg){
		return "Aritel: Your message send successfully";
	}
}