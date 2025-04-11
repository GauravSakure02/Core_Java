package oops_project2;
class Vi implements SIM{				//inheritance

	private double balance;				//encapuslation
	
	@Override
	public void recharge(double amt){	//polymorphism
		this.balance = this.balance + amt;
		System.out.println("Vi SIM is recharged");
		currentBalance();
	}

	@Override
	public void currentBalance(){
		System.out.println(
			"Vi SIM existing balance: "+ balance);
	}

	@Override
	public String call(long mn){
		return "Vi: Your number is not rechable."+
			   "\nPlease dial after some time";
	}
	
	@Override
	public String sms(long mn, String msg){
		return "Vi: Your message send successfully";
	}
}