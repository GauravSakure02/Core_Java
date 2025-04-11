package collection1;

import java.util.HashSet;

public class Test12_Hashset {
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println();

		System.out.print(hs.add("a"));    System.out.println("\t" + hs);
		System.out.print(hs.add("b"));    System.out.println("\t" + hs);
		System.out.print(hs.add(97));    System.out.println("\t" + hs);
		System.out.print(hs.add(98));    System.out.println("\t" + hs);
		System.out.print(hs.add(true));    System.out.println("\t" + hs);
		System.out.print(hs.add(6.7));    System.out.println("\t" + hs);
		System.out.print(hs.add('p'));    System.out.println("\t" + hs);
		System.out.print(hs.add(null));    System.out.println("\t" + hs);
		System.out.print(hs.add(0));    System.out.println("\t" + hs);
		System.out.print(hs.add(99));    System.out.println("\t" + hs);
		System.out.print(hs.add('c'));    System.out.println("\t" + hs);
		
		System.out.print(hs.add("a"));    System.out.println("\t" + hs);
		System.out.print(hs.add(97));    System.out.println("\t" + hs);
		System.out.print(hs.add(null));    System.out.println("\t" + hs);
		
		System.out.print(hs.add(new String("a")));    System.out.println("\t" + hs);
		System.out.print(hs.add(new Integer(97)));    System.out.println("\t" + hs);
		
		System.out.print(hs.add(new Ex(5,7)));  System.out.println("\t" + hs);
		System.out.print(hs.add(new Ex(5,7)));  System.out.println("\t" + hs);
		
		System.out.print(hs.add(new Sa(5,7)));  System.out.println("\t" + hs);
		System.out.print(hs.add(new Sa(5,7)));  System.out.println("\t" + hs);
		
		System.out.println(hs.size());
		System.out.println();
/* */		
	}
}