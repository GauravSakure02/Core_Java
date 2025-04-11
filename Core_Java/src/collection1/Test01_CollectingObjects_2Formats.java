package collection1;

import java.util.ArrayList;
import java.util.HashMap;

public class Test01_CollectingObjects_2Formats {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>(5);  //element
		System.out.println(al);
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add(5);	//AB
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
		
	//=============================================

		HashMap<Object, Object> hm = new HashMap<>(5); //entry
		System.out.println(hm);
		System.out.println(hm.size());
		
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put(5, 3);
		hm.put(6.7, 4);
		hm.put('p', 5);
		hm.put(true, 6);
		hm.put(null, 7);

		System.out.println(hm);
		hm.put("a", 7);
		System.out.println(hm);
		hm.put(5, 8);
		System.out.println(hm);
		hm.put(null, 9);
		System.out.println(hm);
		
		System.out.println(hm.size());
		
	}
}
