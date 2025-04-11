package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test27_Itertor_Rules {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		Iterator<Object> itr = al.iterator();
		//System.out.println(itr.next());  //RE: NSEE
						//Rule # 1: We can not call next() method on empty collection
						// or not empty location

		
		al.add("a");
		itr = al.iterator();
		System.out.println(itr.next());  	//a
		//System.out.println(itr.next());  	//RE: NSEE
						//We can not call next() method on empty location
//==========================================================================================		
		al.add(5);
		//System.out.println(itr.next());  	//RE: CME
						//Rule #2: after collection object is modified structurally
						//by calling collection methods add() or remove(), we can continue
						//the same iterator object, it leads to ConcurrentModificationException
						//this type of cursor is called 'fail-fast' cursor
		
//==========================================================================================		
		itr = al.iterator();
		itr.remove(); //RE: ISE
			//Rule #3: we can not call remove() method without calling next()

	}
}