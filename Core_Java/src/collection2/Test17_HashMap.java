package collection2;

import java.util.HashMap;

public class Test17_HashMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

		System.out.print(hm.put("a", 1));    System.out.println("\t" + hm);
		System.out.print(hm.put("b", 2));    System.out.println("\t" + hm);
		System.out.print(hm.put(97, 3));    System.out.println("\t" + hm);
		System.out.print(hm.put(98, 4));    System.out.println("\t" + hm);
		System.out.print(hm.put(true, 5));    System.out.println("\t" + hm);
		System.out.print(hm.put(6.7, 6));    System.out.println("\t" + hm);
		System.out.print(hm.put('p', 7));    System.out.println("\t" + hm);
		System.out.print(hm.put(null, 8));    System.out.println("\t" + hm);
		System.out.print(hm.put(0, 9));    	System.out.println("\t" + hm);
		System.out.print(hm.put(99, 10));    System.out.println("\t" + hm);
		System.out.print(hm.put('c', 11));    System.out.println("\t" + hm);
		
		System.out.print(hm.put("a", 12));    System.out.println("\t" + hm);
		System.out.print(hm.put(97, 13));    System.out.println("\t" + hm);
		System.out.print(hm.put(null, 14));    System.out.println("\t" + hm);
		
		System.out.print(hm.put(new String("a"), 15)); System.out.println("\t" + hm);
		System.out.print(hm.put(new Integer(97), 16)); System.out.println("\t" + hm);
		
		System.out.print(hm.put(new Ex(5,6), 17)); System.out.println("\t" + hm);
		System.out.print(hm.put(new Ex(5,6), 18)); System.out.println("\t" + hm);

		System.out.print(hm.put(new Sa(5,6), 19)); System.out.println("\t" + hm);
		System.out.print(hm.put(new Sa(5,6), 20)); System.out.println("\t" + hm);
		
		Ex e3 = new Ex(7, 8);
		System.out.print(hm.put(e3, 21)); 			System.out.println("\t" + hm);
		System.out.print(hm.put(e3, 22)); 			System.out.println("\t" + hm);
		System.out.print(hm.put(new Ex(7, 8), 23)); System.out.println("\t" + hm);
		
		System.out.println(hm.size());/*
		System.out.println();
	/**/	
	}
}