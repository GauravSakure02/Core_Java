package collection1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Test03_RetrievingObjects {
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
		
	//retrieving objects randomly
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		System.out.println(al.get(7));
		//System.out.println(al.get(-1)); //RE: IOOBE
		//System.out.println(al.get(al.size())); //RE: IOOBE
		System.out.println(al.get(al.size()-1));
		
	//retrieving objects sequentially
		for(int i=0; i<al.size(); i++) {
			System.out.print( al.get(i) + "  ");
		}
		
		System.out.println();
		
		for(Object obj  : al) {
			System.out.print( obj + "  ");
		}		

		System.out.println();
		System.out.println();

		//Storing [H, H, only U objects] in [hash code] order-> use HashSet class
		HashSet<Object> hs = new HashSet<>(5);  
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
	//Set allows us to retrieve only sequentially	
	
		//System.out.println(hs.get(0));
	  
		for(Object obj  : hs) {
			System.out.print( obj + "  ");
		}
		
		System.out.println();
		System.out.println();
		
		//Storing [H, H, only U] objects in [insertion] order-> use LinkedHashSet class
		LinkedHashSet<Object> lhs = new LinkedHashSet<>(5);  
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
		for(Object obj : lhs) {
			System.out.print( obj + "  ");
		}
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
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		
		System.out.println(ts2);

		for(Object obj : ts2) {
			System.out.print( obj + "  ");
		}
	
		System.out.println();
		
		
		HashMap<Object, Object> hm = new HashMap<>(5); //entry
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put(5, 3);
		hm.put(6.7, 4);
		hm.put('p', 5);
		hm.put(true, 6);
		hm.put(null, 7);
		
		System.out.println(hm);
	
		//keys can be retrieved only sequentially
		//values can be retrieved both randomly and sequentially
		
	//retrieving values from map randomly by passing its key	
		System.out.println(hm.get("a"));
		System.out.println(hm.get(6.7));
		System.out.println(hm.get(null));
		System.out.println(hm.get("x"));
		System.out.println();
		
	//retrieving keys from a map sequentially
		Set<Object> keySet = hm.keySet();
		for(Object key : keySet) {
			System.out.println(key);
		}
		System.out.println();
		
	//retrieving keys and its values from a map sequentially
		System.out.println(hm);
		for(Object key : keySet) {
			System.out.println(key +"="+ hm.get(key));
		}
		
		System.out.println();
		
		//retrieving only values from a map sequentially
		System.out.println(hm);
		Collection<Object> values = hm.values();
		for(Object value : values) {
			System.out.println(value);
		}
		System.out.println();
		
	//retrieving object in LIFO order
		Stack<Object> stack = new Stack<Object>();
		System.out.println("Stack");
		stack.push("a");
		stack.push("b");
		stack.push(5);
		stack.push(6.7);
		stack.push('p');
		stack.push(null);
		stack.push(true);
		
		System.out.println(stack);
		System.out.print(stack.peek()); System.out.println("\t"+ stack);
		System.out.print(stack.peek()); System.out.println("\t"+ stack);
		System.out.print(stack.peek()); System.out.println("\t"+ stack);
		System.out.println();
		
		System.out.print(stack.pop()); System.out.println("\t"+ stack);
		System.out.print(stack.pop()); System.out.println("\t"+ stack);
		System.out.print(stack.pop()); System.out.println("\t"+ stack);
		System.out.println();
		
		stack.clear();
		System.out.println(stack);
		//System.out.print(stack.pop()); //RE: EmptyStackException
		//System.out.print(stack.peek()); //RE: EmptyStackException
		System.out.println();
		
	//retrieving objects in FIFO order
		PriorityQueue<Object> pq = new PriorityQueue<>();
		System.out.println("Queue");
		pq.offer("a");
		pq.offer("c");
		pq.offer("b");
		pq.offer("p");
		pq.offer("A");
		pq.offer("P");
		pq.offer("C");
		pq.offer("B");
		pq.offer("B");
		
		//pq.offer(5);
		//pq.offer(null);
		
		System.out.println(pq);
		System.out.print(pq.peek()); System.out.println("\t"+pq);
		System.out.print(pq.peek()); System.out.println("\t"+pq);
		System.out.print(pq.peek()); System.out.println("\t"+pq);
		System.out.println();
		
		System.out.print(pq.element()); System.out.println("\t"+pq);
		System.out.print(pq.element()); System.out.println("\t"+pq);
		System.out.print(pq.element()); System.out.println("\t"+pq);
		System.out.println();
		
		System.out.print(pq.poll()); System.out.println("\t"+pq);
		System.out.print(pq.poll()); System.out.println("\t"+pq);
		System.out.print(pq.poll()); System.out.println("\t"+pq);
		System.out.println();
		
		System.out.print(pq.remove()); System.out.println("\t"+pq);
		System.out.print(pq.remove()); System.out.println("\t"+pq);
		System.out.print(pq.remove()); System.out.println("\t"+pq);
		System.out.println();

		PriorityQueue<String> pq2 = new PriorityQueue<>((s1, s2) -> 1);
		pq2.offer("a");
		pq2.offer("c");
		pq2.offer("b");
		pq2.offer("p");
		pq2.offer("A");
		pq2.offer("P");
		pq2.offer("C");
		pq2.offer("B");
		pq2.offer("B");
		System.out.println(pq2);
		
		System.out.print(pq2.element()); System.out.println("\t"+pq2);
		System.out.print(pq2.element()); System.out.println("\t"+pq2);
		System.out.print(pq2.element()); System.out.println("\t"+pq2);
		System.out.println();
		
		System.out.print(pq2.poll()); System.out.println("\t"+pq2);
		System.out.print(pq2.remove()); System.out.println("\t"+pq2);
		System.out.print(pq2.poll()); System.out.println("\t"+pq2);
		System.out.println();
		
		ArrayDeque<Object> adq1 = new ArrayDeque<Object>();
		System.out.println("ArrayDeque");
		adq1.push("a");   //LIFO
		adq1.push("c");
		adq1.push("b");
		adq1.push("e");
		adq1.push(5);
		adq1.push(6.7);
		//adq1.push(null); //RE: NPE
		System.out.println(adq1);
		
		System.out.print(adq1.peek()); System.out.println("\t"+adq1);
		System.out.print(adq1.peek()); System.out.println("\t"+adq1);
		System.out.print(adq1.peek()); System.out.println("\t"+adq1);
		System.out.println();
		
		System.out.print(adq1.pop()); System.out.println("\t"+adq1);
		System.out.print(adq1.pop()); System.out.println("\t"+adq1);
		System.out.print(adq1.pop()); System.out.println("\t"+adq1);
		System.out.println();
		
		ArrayDeque<Object> adq2 = new ArrayDeque<Object>();
		adq2.offer("a");
		adq2.offer("c");		//FIFO
		adq2.offer("b");
		adq2.offer("e");
		adq2.offer(5);
		adq2.offer(6.7);
		System.out.println(adq2);
		
		System.out.print(adq2.peek()); System.out.println("\t"+adq2);
		System.out.print(adq2.peek()); System.out.println("\t"+adq2);
		System.out.print(adq2.peek()); System.out.println("\t"+adq2);
		System.out.println();
				
		System.out.print(adq2.pop()); System.out.println("\t"+adq2);
		System.out.print(adq2.pop()); System.out.println("\t"+adq2);
		System.out.print(adq2.pop()); System.out.println("\t"+adq2);
		
/**/
	}
	
}