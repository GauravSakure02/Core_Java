package collection1;

import java.util.Vector;

public class Test01_Vector {
	public static void main(String[] args) {
		
		//1. Creating collection object
		Vector<Object> v1 = new Vector<>();
		
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println();
		
		v1.add("a");
		v1.add("b");
		v1.add(5);
		v1.add(6.7);
		v1.add('a');
		v1.add(true);
		v1.add(null);
		v1.add("a");
		v1.add(null);
		v1.add(5);
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println();
		
		v1.add(6.7);
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println();
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(4));
		System.out.println(v1.get(5));
		System.out.println(v1.get(10));
		System.out.println();
		
		for(int i=0; i<v1.size(); i++) {
			System.out.print(v1.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(v1.contains("a")); //String("a").equals(ele[i])
		System.out.println(v1.contains(6.7)); //Double(6.7).equals(ele[i])
		System.out.println(v1.contains("A")); //String("A").equals(ele[i])	
		System.out.println(v1.contains(null)); //null==ele[i])	
		
	}
}