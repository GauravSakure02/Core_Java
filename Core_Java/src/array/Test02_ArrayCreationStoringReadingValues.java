package array;

import java.util.Arrays;

public class Test02_ArrayCreationStoringReadingValues {
	public static void main(String[] args) {
				  //0  1  2  3  4	
		int[] ia = {3, 4, 5, 6, 7};

		System.out.println("ia   : "+ ia); 
		System.out.println();
		
//Approach #1: Reading and printing directly	//Problem: This code is 
//		System.out.println("ia[0]: "+ ia[0]);	//static nature code because
//		System.out.println("ia[1]: "+ ia[1]);	//as and when the number of
//		System.out.println("ia[2]: "+ ia[2]);	//values in array object are 
//		System.out.println("ia[3]: "+ ia[3]);	//increased or decreased
//		System.out.println("ia[4]: "+ ia[4]);	//we must add and remove	
//		System.out.println();					//these printing statements
		
//		System.out.println("ia[5]: "+ ia[5]); //RE: j.l.AIOOBE
		
 //Solution: we must develop dynamic code by using for loop

//Approach #2: Reading and printing	by using loop with index	

		for(int i=0; i<ia.length; i++){			
			int value = ia[i];
			System.out.println("ia["+i+"]: "+ value); 
		}
		System.out.println();
	
//Approach #3: Reading and printing by using for-each loop or enhanced for loop(Java 5v new feature)	

		for(int value : ia){					
			System.out.println(value); 
		}
		System.out.println();
			
//Approach #4: Directly printing by using predefined method Arrays.toString(-)
		System.out.println(java.util.Arrays.toString(ia)); //[3, 4, 5, 6, 7]
		System.out.println();
		
//Approach #5: by using stream API by using lambda expression
		Arrays.stream(ia).forEach(value -> System.out.println(value));
		System.out.println();
		
	//by using stream API by using method reference
		Arrays.stream(ia).forEach(System.out::println);
		
		
//10. Limitation of an array object	
//  - It can store only same or similar type values
//	- If we try to store different type values, we will get CE
	  
//	- For example  			

	int[] ia2 = {5, 6, 7};		//same type of values
	
	int[] ia3 = {5, 'a', 7};	//similar type of values
								//means same type or its lesser type values
								
//	int[] ia4 = {5, 7L, 10.5, true}; //incompatible types and higer range 
							//values are not allowed to store, we will get CE
	
	//solution: we must user defined class object or collection object
	  
/*	 */
	}
}
