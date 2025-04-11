package collection1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test06_LL_a_s_r_r_i_r_s_algorithms {
	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
	
	//storing algorithm [node objects with double linking] 	
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(6.7);
		ll.add('p');
		ll.add(true);
		ll.add(null);
		ll.add(new Ex(5,6));
		ll.add(new Sa(5,6));
		ll.add("a");
		ll.add(5);
		ll.add(6.7);
		ll.add(new Ex(5,6));
		ll.add(new Ex(7,8));
		ll.add(new Sa(5,6));
		ll.add(new Sa(7,8));
		ll.add(new StringBuffer("hari"));
		ll.add(new StringBuilder("balayya"));
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println();
		
	//searching objects [linear searching algorithm]
		System.out.println(ll.contains("a")); 			//-> loop -> Str("a").equals(eles); -> true
		System.out.println(ll.contains(5)); 			//-> loop -> Inte(5).equals(eles);  -> true
		System.out.println(ll.contains(null)); 			//-> loop -> null    ==     eles;   -> true
		System.out.println(ll.contains(6.7)); 			//-> loop -> Dou(6.7).equals(eles)  -> true
		System.out.println(ll.contains(new Ex(5,6))); 	//-> loop -> Ex(5, 6).equals(eles)  -> false
		System.out.println(ll.contains(new Sa(5,6))); 	//-> loop -> Sa(5, 6).equals(eles)  -> true
		System.out.println(ll.contains(new StringBuffer("hari"))); 	//-> loop -> SB("hari").equals(eles)  -> false
		System.out.println(ll.contains(new StringBuilder("balayya"))); 	//-> loop -> SB("balayya").equals(eles)  -> false
		System.out.println();
		
	//finding index of the given object [linear searching algorithm]
		System.out.println(ll.indexOf("a")); 			//-> loop -> Str("a").equals(eles); -> 0
		System.out.println(ll.indexOf(5)); 				//-> loop -> Inte(5).equals(eles); 	-> 2
		System.out.println(ll.indexOf(null)); 			//-> loop -> null    ==     eles;   -> 6
		System.out.println(ll.indexOf(6.7)); 			//-> loop -> Dou(6.7).equals(eles)  -> 3
		System.out.println(ll.indexOf(new Ex(5,6))); 	//-> loop -> Ex(5, 6).equals(eles)  -> -1
		System.out.println(ll.indexOf(new Sa(5,6))); 	//-> loop -> Sa(5, 6).equals(eles)  -> 8
		System.out.println(ll.indexOf(new StringBuffer("hari"))); 	//-> loop -> SB("hari").equals(eles)  		-> -1 
		System.out.println(ll.indexOf(new StringBuilder("balayya"))); 	//-> loop -> SB("balayya").equals(eles) -> -1 
		System.out.println();
		
	//retrieving object [sequential access with (binary search algorithm)]
		System.out.println(ll.get(0));
		System.out.println(ll.get(10));
		//System.out.println(al.get(20)); //RE: AIOOBE
		//System.out.println(al.get(-1)); //RE: AIOOBE
		System.out.println();
		
	//Removing object [Linear searching algorithm + just links are changed with prev and next objects]
		System.out.println(ll);
		System.out.println(ll.remove("a")); //object "a" is removed
		System.out.println(ll);
		
					//[Binary searching algorithm + changing links with prev and next objects]
		System.out.println(ll.remove(5));  //index 5 object is removed
		System.out.println(ll);
		
		System.out.println(ll.remove((Integer)5));  //Integer(5) object is removed
		System.out.println(ll);
		
	//	System.out.println(al.remove('p'));  			//RE: AIIOOBE //index 'p'(112)  object is removed
		System.out.println(ll.remove((Character)'p'));  //Character('p') object is removed
		System.out.println(ll);
		
		System.out.println(ll.remove(true));  //Boolean(true) object is removed
		System.out.println(ll);
		
		System.out.println(ll.remove(6.7));  //Double(6.7) object is removed
		System.out.println(ll);
		
		System.out.println(ll.remove(new Ex(5,6)));  //Ex(5, 6) object is trying to be removed
		System.out.println(ll);						//but it is not removed, equals() is not overridden
		
		System.out.println(ll.remove(new Sa(5,6)));  //Sa(5, 6) object is trying to be removed
		System.out.println(ll);						//it is removed, equals() is overridden
	//============================================================	
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			al2.add(i*10);
		}
								 // 0   1   2   3   4   5   6   7   8   9	
		System.out.println(al2); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		
		al2.remove(1);           //[10, 30, 40, 50, 60, 70, 80, 90, 100]
		al2.remove(2);			 //[10, 30, 50, 60, 70, 80, 90, 100]
		
		System.out.println(al2); //[10, 30, 50, 60, 70, 80, 90, 100]
		
	//============================================================	
		
	//insertion operation [Binary searching algorithm + changing links with prev and next objects]
		al2.add(1, 5); 		//[10, 5, 30, 50, 60, 70, 80, 90, 100]
		System.out.println(al2);
		
	//replacing operation  [Binary searching algorithm and changing item in this node]
		al2.set(3, 1); 		//[10, 5, 30, 1, 60, 70, 80, 90, 100]
		System.out.println(al2);
		
	//sorting objects
		al2.sort(null);
		System.out.println(al2);
/**/		
	}
}



