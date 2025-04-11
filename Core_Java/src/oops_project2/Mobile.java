package oops_project2;
public class Mobile {
	//HAS-A relation
	private SIM sim;
	
	public void insertSIM(String simName) throws Exception{
		try{
			Class cls = Class.forName(simName);
			Object obj = cls.newInstance();

			if(obj instanceof SIM ){
				this.sim = (SIM)obj;
			}else {
				throw new Exception(sim + " is not a SIM");
			}

		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}
	}

	public void recharge(double amt){
		sim.recharge(amt);
	}

	public void currentBalance(){
		sim.currentBalance();
	}

	public String call(long mn){
		return sim.call(mn);
	}

	public String sms(long mn, String msg) {
		return sim.sms(mn, msg);
	}
}
	