package collection2;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Test17_WeakHashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> 	hm 	= new HashMap<>();
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		
		hm.put(new String("a"), 5);
		hm.put(new Integer(97), 6);
		System.out.println(hm);
		
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(hm);
		
		whm.put(new String("a"), 7);
		whm.put(new Integer(97), 8);
		
		String s2 = new String("b");	
		whm.put(s2, 9);
		System.out.println(whm);
		
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(whm);
		System.out.println();
		
		whm.put("c", 10);
		whm.put(15, 10);
		
		System.out.println(whm);
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(whm);
		System.out.println();
		
		whm.put(150, 110);
		
		System.out.println(whm);
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(whm);
		
	/**/	
	}
}