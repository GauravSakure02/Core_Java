package collection2;

import java.util.Hashtable;

public class Test21_HashTable {
	public static void main(String[] args) {
		
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put(97, 3);
		ht.put(98, 4);
		ht.put("a", 5);
		//ht.put(null, 6);
		//ht.put("b", null);
		System.out.println(ht);
	}
}