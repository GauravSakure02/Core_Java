package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test26_Iterator_Remove {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		Iterator<Object> itr = al.iterator();
		//itr.remove();  //RE: IllegalStateException
				//Rule#1: we must call remove() method only after itr.next() call
		
		itr.next();
		itr.remove();	//a is removed
		//itr4.remove();		//RE: ISE
				//Rule #2: We can not call remove() method more than once at a time. 
				//for calling remove() multiple times
				//        we must also call next() method also multiple times alternatively

		System.out.println(al);
		
		itr.next();
		itr.remove();	//5 is removed
		System.out.println(al);
		
		itr.next();
		itr.remove();	//b is removed
		System.out.println(al);
				//conclusion: The remove() method removes 
				//				the next() method returned object
		System.out.println();
	//===========================================
		al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		itr = al.iterator(); 
		
		while(itr.hasNext()) {
			itr.next();
			itr.remove();		//calling remove() in while loop
		}						//removes all objects from collection
								//it is equals() to al.clear()
		System.out.println(al);
		System.out.println();
	//===========================================
		al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		itr = al.iterator(); 
		
		while(itr.hasNext()) {
			itr.next();
		}						
		itr.remove();		//calling remove() method after while() loop
							//removes last element available in collection
		System.out.println(al);
		System.out.println();
	//===========================================
		al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		itr = al.iterator(); 
		
		while(itr.hasNext()) {	//removing all Strings available in collection
			Object obj = itr.next();
			
			if(obj instanceof String) {
				itr.remove();		//remove() if it is String				
			}
		}						
		itr.remove();		//last element 7 is removed				
		System.out.println(al);
		System.out.println();
	//===========================================
		al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		itr = al.iterator(); 
		
		while(itr.hasNext()) {	//removing all integers available in collection
			Object obj = itr.next();
			
			if(obj instanceof Integer) {
				itr.remove();		//remove() if it is an integer
			}
		}						
		//itr.remove();		//RE: java.lang.IllegalStateException				
							//because the last element 7 is already removed in while loop
		System.out.println(al);
		//===========================================
		
		 
	}
}