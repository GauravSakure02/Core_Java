package cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test28_FailFast_FailSafe_Cursors {
	public static void main(String[] args) {
		/*	
			2 types of cursor			
			 	1. Fail-Fast						
			 	2. Fail-Safe												
			 
			 Iterator 
			 	1. on CsF collections			fail-fast, throws CME
			 	2. on Concurrent Collections	fail-safe, does not CME 

		Q) What are fail-fast and fail-safe iterators?	
			1. An iterator that does not allow modifying collection object
			  structurally, that iterator is called 'fail-fast' iterator
			
				- if collection object is modified during iteration
				  the fail-fast iterator next() method throws exception CME
				
					- The Iterator on Collections Framework collection is fail-fast
				
			2. An iterator that allows modifying collection object structurally
			  is called fail-safe iterator, it does not throw CME, it allows us
			  to continue iterating over collection
			  
			  	- The same Iterator on Concurrent collections available in 
			  	  java.util.concurrent package is 'fail-safe' iterator, 
			  	  it does not CME.
			  
		*/
		
		//Iterator on Collections Framework collection available in java.util package 
		//is fail-fast, it throws CME
			ArrayList<Object> al = new ArrayList<>();
			al.add("a");
			al.add(5);
			
			Iterator<Object> itr1 = al.iterator();
			System.out.println(itr1.next());
			      al.add("b"); //collection is modifying structurally
			//System.out.println(itr1.next()); //Continuing the same iterator
										//then leads CME, Iterator is Fail-Fast
			
			CopyOnWriteArrayList<Object> cwa = new CopyOnWriteArrayList<Object>();
			 cwa.add("a");
			 cwa.add(5);
			 cwa.add("b");
			 cwa.add(6);
			 cwa.add("c");
			 cwa.add(7);
			 System.out.println(cwa);
			 
			 Iterator<Object> itr = cwa.iterator();
			 while(itr.hasNext()) {
				 Object obj = itr.next();
				 System.out.print(obj + "  ");
			 }
			 System.out.println();
			 
			 Iterator<Object> itr7 = cwa.iterator();
			 System.out.println(itr7.next());
			 	cwa.add("d");
			 System.out.println(cwa);
			 System.out.println(itr7.next());	
			 						//fail-safe, no CME
			 
			 System.out.println();
			 
		//Q) Is Enumeration is fail-safe or fail-fast?
			 /* 
			  * It is both FS and FF
			  * 	- on LC Vector with elements() method implementation it is FS
			  * 
			  * 	- On LC Vector and on CsF collections with Collections.enumeration(-) 
			  *       method implementation, it is FF 
			  */
			 
				
			Vector<Object> v = new Vector<>();
			v.add("a");
			v.add(5);
			
			Enumeration<Object> e1 = v.elements();
			System.out.println(e1.nextElement());
			v.add("b");								//Vector object is modified
			System.out.println(e1.nextElement());	//Continuing the same Enumeration object
											//no CME, so it is FS
			
		//==============================================================	 
			Enumeration<Object> e2 = Collections.enumeration(v); //internally uses Iterator only
			System.out.println(e2.nextElement());
			v.add(6);								//Vector object is modified
			System.out.println(e2.nextElement());	//Continuing the same Enumeration object
									//it leads to CME, so it is FF
	}
}