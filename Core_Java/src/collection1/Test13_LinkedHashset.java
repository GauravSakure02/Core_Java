package collection1;

import java.util.LinkedHashSet;

public class Test13_LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println();

		System.out.print(lhs.add("a"));    System.out.println("\t" + lhs);
		System.out.print(lhs.add("b"));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(97));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(98));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(true));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(6.7));    System.out.println("\t" + lhs);
		System.out.print(lhs.add('p'));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(null));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(0));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(99));    System.out.println("\t" + lhs);
		System.out.print(lhs.add('c'));    System.out.println("\t" + lhs);
		
		System.out.print(lhs.add("a"));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(97));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(null));    System.out.println("\t" + lhs);
		
		System.out.print(lhs.add(new String("a")));    System.out.println("\t" + lhs);
		System.out.print(lhs.add(new Integer(97)));    System.out.println("\t" + lhs);
		
		System.out.print(lhs.add(new Ex(5,7)));  System.out.println("\t" + lhs);
		System.out.print(lhs.add(new Ex(5,7)));  System.out.println("\t" + lhs);
		
		System.out.print(lhs.add(new Sa(5,7)));  System.out.println("\t" + lhs);
		System.out.print(lhs.add(new Sa(5,7)));  System.out.println("\t" + lhs);
		
		System.out.println(lhs.size());
		System.out.println();
		
	}
}