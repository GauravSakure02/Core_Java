package abstraction;
abstract class Bus implements Vehicle{
	@Override
	public void breaks(){
         System.out.println("Bus has normal breaks");
	}
}