package cursor;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test23_get {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println(al.get(4));
		
		//System.out.println(al.get(6));			//Rule #1: index>=0 && <size()
		//System.out.println(al.get(-1));			//else it leads RE: IOOBE	
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {	//valid
		//for(int i=0; i<=al.size(); i++) {	//not valid  => all 5 values are printed
			System.out.println(al.get(i));	//				then at last we will get 				
		}									//				//RE: IOOBE						
		
		System.out.println();
		
		//String s1 = al.get(0); CE:				//Rule #2: we must assign get() call 
													//to the variable of type 
		Object o1 = al.get(0); 						//collection generic type
		System.out.println(o1);						//else we will get CE: i c t
		
		//System.out.println(o1.toUpperCase());		//Rule #3: we can not invoke
													//the returned object's specific method
													//by using Object type variable
													//we must do type casting
		
		//String s1 = (String)o1;	//RE: CCE		//Rule #4: we must not type cast
		//System.out.println(s1.toUpperCase());		//directly, it leads RE: CCE	
				
		if(o1 instanceof String) {					//we must do under 'instanceof' 
			String s1 = (String)o1;					//if condition
			System.out.println(s1.toUpperCase());
		}
		System.out.println();
		
		//dynamically retrieving a particular object from List 
		//by passing index number by using indexOf() and get() methods 
		int index = al.indexOf("a");
		Object obj = al.get(index);		
		String s = (String)obj;
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("b"));
		
	//============================================================================
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);

		//obj = lhs.get(???);  //LHS, Set implementation classes 
							//do not have index, then we can not 
							//use get() method on Set implementation
							//collection classes HS, LHS, TS and ES
		
		//Solution: we must use inbuilt Cursor objects 
			//1. Enumeration
			//2. Iterator
			//3. for-each loop
			//4. forEach(-) method
			//5. Stream API
			//6. Spliterator
		
		//we can also apply above Cursor objects on List implemented 
		//collection classes V, AL, LL, Stack
		
		//Hence we can say Cursors are the common approach
		//for retrieving objects from all types of collections
		
		//get() method and ListIterator are specific to only List
		//other 6 approaches are common approaches
		
	}
}