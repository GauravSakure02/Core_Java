package collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test02_CollectingObjects_3Orders {
	public static void main(String[] args) {
		
		//Storing [H, H, U and D] objects in [insertion order]-> Use ArrayList class
		ArrayList<Object> al = new ArrayList<>(5);  
		System.out.println(al);
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add(5);	
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add(null);
		al.add("a");
		al.add(5);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		//Storing [H, H, only U objects] in [hash code] order-> use HashSet class
		HashSet<Object> hs = new HashSet<>(5);  
		System.out.println(hs);
		System.out.println(hs.size());
		hs.add("a");
		hs.add("b");
		hs.add(5);	
		hs.add(6.7);
		hs.add('p');
		hs.add(true);
		hs.add(null);
		hs.add("a");
		hs.add(5);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println();
		
		//Storing [H, H, only U] objects in [insertion] order-> use LinkedHashSet class
		LinkedHashSet<Object> lhs = new LinkedHashSet<>(5);  
		System.out.println(lhs);
		System.out.println(lhs.size());
		lhs.add("a");
		lhs.add("b");
		lhs.add(5);	
		lhs.add(6.7);
		lhs.add('p');
		lhs.add(true);
		lhs.add(null);
		lhs.add("a");
		lhs.add(5);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println();

		//Storing [only Homogeneous, Comparable, U and D] objects in [Sorting(ASC/DESC)] order -> use TreeSet class
		TreeSet<Object> ts = new TreeSet<>();  
		System.out.println(ts);
		System.out.println(ts.size());
		ts.add("a");
		ts.add("c");
		ts.add("b");
		//ts.add(5);		//RE: CCE
		//ts.add(null);		//RE: NPE
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println();
		
		TreeSet<Integer> ts2 = new TreeSet<>();  
		System.out.println(ts2);
		System.out.println(ts2.size());
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		
		System.out.println(ts2);
		System.out.println(ts2.size());
		System.out.println();
		
	}
}