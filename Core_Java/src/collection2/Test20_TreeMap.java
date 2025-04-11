package collection2;

import java.util.TreeMap;

public class Test20_TreeMap {
	public static void main(String[] args) {
		TreeMap<Object, Object> tm1 = new TreeMap<>();
		tm1.put("a", 1);
		tm1.put("c", 2);
		tm1.put("b", 3);
		System.out.println(tm1); 
	
		//tm1.put(5, "4"); //RE: CCE
		tm1.put("d", "5"); 
		//tm1.put(null, "5"); //RE: NPE
		tm1.put("e", null); 
		tm1.put("f", null); 
		tm1.put("a", 6); 
		tm1.put("g", 6); 
		System.out.println(tm1); 
		
	}
	
}