package cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test24_Enumeration {
	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		v.add("a");
		v.add(5);
		v.add("b");
		v.add(6);
		v.add("c");
		v.add(7);
		System.out.println(v);
		
		Enumeration<Object> e1 = v.elements();
		
		while(e1.hasMoreElements()) {
			Object obj = e1.nextElement();
			System.out.println(obj);
		}
		System.out.println();
//==================================================================
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		Enumeration<Object> e2 = Collections.enumeration(al);
		
		while(e2.hasMoreElements()) {
			Object obj = e2.nextElement();
			System.out.print(obj + " ");
		}
		System.out.println();
		System.out.println();
//====================================================================
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		Enumeration<Object> e3 = Collections.enumeration(lhs);
		
		while(e3.hasMoreElements()) {
			Object obj = e3.nextElement();
			System.out.print(obj + " ");
		}
		System.out.println();

		
	}
}