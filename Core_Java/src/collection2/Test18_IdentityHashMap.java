package collection2;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test18_IdentityHashMap {
	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<>();
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		
		hm.put(new String("a"), 5);
		hm.put(new Integer(98), 8);
		hm.put(new String("b"), 6);
		hm.put(new Integer(97), 7);
		hm.put(null, 7);

		ihm.put(new String("a"), 5);
		ihm.put(new Integer(98), 8);
		ihm.put(new String("b"), 6);
		ihm.put(new Integer(97), 7);
		ihm.put(null, 7);
		
		System.out.println(hm);
		System.out.println(ihm);
		
	}
}