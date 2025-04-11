package oops_project2;
class BSNL implements SIM{				//inheritance

	private double balance;				//encapuslation
	
	@Override
	public void recharge(double amt){	//polymorphism
		this.balance = this.balance + amt;
		System.out.println("BSNL SIM is recharged");
		currentBalance();
	}

	@Override
	public void currentBalance(){
		System.out.println(
			"BSNL SIM existing balance: "+ balance);
	}

	@Override
	public String call(long mn){
		return "BSNL: All lines are busy."+
			   "\nPlease dial after some time";
	}
	
	@Override
	public String sms(long mn, String msg){
		return "BSNL: Your message send successfully";
	}
}