package oops_project2;
public interface SIM  {
	void recharge(double amt);
	void currentBalance();
	String call(long mn);
	String sms(long mn, String msg);
}