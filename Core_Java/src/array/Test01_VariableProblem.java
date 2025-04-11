package array;
public class Test01_VariableProblem {
	public static void main(String[] args) {
		
		int i1 = 3;		//The problem with variables
		int i2 = 4;		//for storing new value 
		int i3 = 5;		//every time we must modify code 
		int i4 = 6;		//for adding new variable declaration statement
		int i5 = 7;
		
		System.out.println(i1);	//this printing or accessing variables logic 
		System.out.println(i2);	//is also static nature code
		System.out.println(i3);  //when we add new variable or when we remove existing variable
		System.out.println(i4);  //we must modify code by adding or removing Sopln()
		System.out.println(i5);	//hence this variables based code is static nature code
		
//		m1();
		m1(10);					//method has one parameter and can pass only one argument
//		m1(10, 20);
//		m1(10, 20, 30);
		
	}
	
	static void m1(int a) {  //static nature code, can receive only one value at time
							//for relieving 0-n number of values, we must change number of   
	}						//parameters every time or we must overload this method
	
}