package collection2;

import java.util.LinkedHashMap;

public class Test16_LinkedHashMap {
	public static void main(String[] args) {
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

		System.out.print(lhm.put("a", 1));    System.out.println("\t" + lhm);
		System.out.print(lhm.put("b", 2));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(97, 3));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(98, 4));    System.out.println("\t" + lhm);
		
		System.out.print(lhm.put(true, 5));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(6.7, 6));    System.out.println("\t" + lhm);
		
		System.out.print(lhm.put('p', 7));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(null, 8));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(0, 9));    System.out.println("\t" + lhm);
		
		System.out.print(lhm.put(99, 10));    System.out.println("\t" + lhm);
		System.out.print(lhm.put('c', 11));    System.out.println("\t" + lhm);
		
		System.out.print(lhm.put("a", 12));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(97, 13));    System.out.println("\t" + lhm);
		System.out.print(lhm.put(null, 14));    System.out.println("\t" + lhm);
		
		System.out.println(lhm.size());
		System.out.println();
	/**/	
	}
}