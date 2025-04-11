package collection1;

import java.util.ArrayList;

public class Test02_ArrayList {
	public static void main(String[] args) {
		
		//1. Creating collection object
		ArrayList<Object> al = new ArrayList<>();
		
//		System.out.println(v1.capacity());
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('a');
		al.add(true);
		al.add(null);
		al.add("a");
		al.add(null);
		al.add(5);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		al.add(6.7);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(10));
		System.out.println();
				
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(al.contains("a")); //String("a").equals(ele[i])
		System.out.println(al.contains(6.7)); //Double(6.7).equals(ele[i])
		System.out.println(al.contains("A")); //String("A").equals(ele[i])	
		System.out.println(al.contains(null)); //null==ele[i])	
/**/		
	}
}