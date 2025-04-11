package collection1;

import java.util.LinkedList;

public class Test03_LinkedList {
	public static void main(String[] args) {
		
		//1. Creating collection object
		LinkedList<Object> ll = new LinkedList<>();
		
//		System.out.println(v1.capacity());
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println();
		
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(6.7);
		ll.add('a');
		ll.add(true);
		ll.add(null);
		ll.add("a");
		ll.add(null);
		ll.add(5);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println();
		
		ll.add(6.7);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println();
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(4));
		System.out.println(ll.get(5));
		System.out.println(ll.get(10));
		System.out.println();
				
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(ll.contains("a")); //String("a").equals(ele[i])
		System.out.println(ll.contains(6.7)); //Double(6.7).equals(ele[i])
		System.out.println(ll.contains("A")); //String("A").equals(ele[i])	
		System.out.println(ll.contains(null)); //null==ele[i])	
/**/		
	}
}