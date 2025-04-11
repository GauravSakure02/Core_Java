package cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test25_Iterator {
	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		v.add("a");
		v.add(5);
		v.add("b");
		v.add(6);
		v.add("c");
		v.add(7);
		System.out.println(v);
		
		Iterator<Object> itr1 = v.iterator();
		
		while(itr1.hasNext()) {
			Object obj = itr1.next();
			System.out.print(obj + "  ");
		}
		System.out.println();
		System.out.println();
	//=============================================================	
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		Iterator<Object> itr2 = al.iterator();
		
		while(itr2.hasNext()) {
			Object obj = itr2.next();
			System.out.print(obj + " ");
		}
		System.out.println();
	//=====================================================================
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		Iterator<Object> itr3 = lhs.iterator();
		
		while(itr3.hasNext()) {
			Object obj = itr3.next();
			System.out.print(obj + " ");
		}
		System.out.println();
		

	}
}
