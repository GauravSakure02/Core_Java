package oops_project1;
class BusDepo {
	public static void main(String[] args) {
		Driver hk = new Driver();
		hk.drive( new RedBus() );			//TC (Tight Coupling)
		hk.drive( new Volvo() );			//TC

		//hk.drive( ??? );	
	}						
}