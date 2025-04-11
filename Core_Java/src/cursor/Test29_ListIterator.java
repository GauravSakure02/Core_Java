package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test29_ListIterator {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		ListIterator<Object> litr = al.listIterator();
		
		while(litr.hasNext()) { //retrieving objects in forward direction
			Object obj = litr.next();
			System.out.print(obj + " ");
		}
		System.out.println();

	//===============================================================	
		while(litr.hasPrevious()) {	//retrieving objects in backward direction
			Object obj = litr.previous();	//rule we call these methods only after next() call
			System.out.print(obj + " ");	//else we will get RE: NSE
		}
		System.out.println();
		System.out.println();

	//===============================================================	
		System.out.println(al);
		int count = 1;
		while(litr.hasNext()) {
			Object obj = litr.next();
			
			if(obj instanceof String s)
				litr.set(s.toUpperCase());	//replacing with its upper case
			
			if(obj instanceof Integer) {
				if(count==1) {
					litr.add(20);	//inserting new element in the next location	
					count++;
				}
			}
		}
		System.out.println(al);
			
		 
	}
}


