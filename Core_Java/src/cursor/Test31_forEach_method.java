package cursor;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test31_forEach_method {
	public static void main(String[] args) {
	
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		al.forEach( obj -> System.out.println(obj) );		//LE
		System.out.println();
			
		al.forEach( System.out::println );					//MR
		System.out.println();
			
		/*
		 * Assignment: Write a program to retrieve objects from LHS by using forEach() method
		 * print String in upper case
		 */
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);	
		
		lhs.forEach(ele -> {
			if(ele instanceof String s)
				System.out.println(s.toUpperCase());
			else
				System.out.println(ele);
		});
		
		/*
		 * - Still there is a problem in the above code 
		 *     For processing the retrieved object means 
		 *     to perform validations and calculations on 
		 *     the retrieved objects we have to write repeated code again 
		 *     
		 * - The solution for this problem is Stream API 
		 * 		Stream API has provided several methods for processing collection 
		 *     
		 * - What is the difference between collection API and stream API ?    
		 *     - Collection API contains objects or stores objects
		 *     
		 *     - Whereas stream API is meant for only processing the objects 
		 *       available in collection by applying required number of 
		 *       validations and calculations  
		 *     
		 *     - Stream API doesn't contain or store objects 
		 *     
		 */
	}
}