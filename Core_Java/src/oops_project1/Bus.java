package oops_project1;
//Bus.java
abstract class Bus implements Vehicle {
	@Override
	public void breaks(){
         System.out.println("Bus has normal breaks");
	}
}