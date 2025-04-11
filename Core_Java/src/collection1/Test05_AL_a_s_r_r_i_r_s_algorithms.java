package collection1;

import java.util.ArrayList;

public class Test05_AL_a_s_r_r_i_r_s_algorithms {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
	
	//Storing objects [resizable array algorithm] 	
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add(null);
		al.add(new Ex(5,6));
		al.add(new Sa(5,6));
		al.add("a");
		al.add(5);
		al.add(6.7);
		al.add(new Ex(5,6));
		al.add(new Ex(7,8));
		al.add(new Sa(5,6));
		al.add(new Sa(7,8));
		al.add(new StringBuffer("hari"));
		al.add(new StringBuilder("balayya"));
		
		System.out.println(al);
		System.out.println(al.size());
		
	//searching objects [linear searching algorithm]
		System.out.println(al.contains("a")); 			//-> loop -> Str("a").equals(eles); -> true
		System.out.println(al.contains(5)); 			//-> loop -> Inte(5).equals(eles);  -> true
		System.out.println(al.contains(null)); 			//-> loop -> null    ==     eles;   -> true
		System.out.println(al.contains(6.7)); 			//-> loop -> Dou(6.7).equals(eles)  -> true
		System.out.println(al.contains(new Ex(5,6))); 	//-> loop -> Ex(5, 6).equals(eles)  -> false
		System.out.println(al.contains(new Sa(5,6))); 	//-> loop -> Sa(5, 6).equals(eles)  -> true
		System.out.println(al.contains(new StringBuffer("hari"))); 	//-> loop -> SB("hari").equals(eles)  -> false
		System.out.println(al.contains(new StringBuilder("balayya"))); 	//-> loop -> SB("balayya").equals(eles)  -> false
		
	//finding index of the given object [linear searching algorithm]
		System.out.println(al.indexOf("a")); 			//-> loop -> Str("a").equals(eles); -> 0
		System.out.println(al.indexOf(5)); 			//-> loop -> Inte(5).equals(eles);  	-> 2
		System.out.println(al.indexOf(null)); 			//-> loop -> null    ==     eles;   -> 6
		System.out.println(al.indexOf(6.7)); 			//-> loop -> Dou(6.7).equals(eles)  -> 3
		System.out.println(al.indexOf(new Ex(5,6))); 	//-> loop -> Ex(5, 6).equals(eles)  -> -1
		System.out.println(al.indexOf(new Sa(5,6))); 	//-> loop -> Sa(5, 6).equals(eles)  ->  8
		System.out.println(al.indexOf(new StringBuffer("hari"))); 	//-> loop -> SB("hari").equals(eles)  		-> -1 
		System.out.println(al.indexOf(new StringBuilder("balayya"))); 	//-> loop -> SB("balayya").equals(eles) -> -1 
		
	
	//retrieving object [random access with the given index number]
		System.out.println(al.get(0));
		System.out.println(al.get(10));
		//System.out.println(al.get(20)); //RE: AIOOBE
		//System.out.println(al.get(-1)); //RE: AIOOBE
		System.out.println();
		
	//Removing object [Linear searching algorithm + Moving elements one location left]
		System.out.println(al);
		System.out.println(al.remove("a")); //object "a" is removed
		System.out.println(al);
		
		System.out.println(al.remove(5));  //index 5 object is removed
		System.out.println(al);
		
		System.out.println(al.remove((Integer)5));  //Integer(5) object is removed
		System.out.println(al);
		
	//	System.out.println(al.remove('p'));  			//RE: AIIOOBE //index 'p'(112)  object is removed
		System.out.println(al.remove((Character)'p'));  //Character('p') object is removed
		System.out.println(al);
		
		System.out.println(al.remove(true));  //Boolean(true) object is removed
		System.out.println(al);
		
		System.out.println(al.remove(6.7));  //Double(6.7) object is removed
		System.out.println(al);
		
		System.out.println(al.remove(new Ex(5,6)));  //Ex(5, 6) object is trying to be removed
		System.out.println(al);						//but it is not removed, equals() is not overridden
		
		System.out.println(al.remove(new Sa(5,6)));  //Sa(5, 6) object is trying to be removed
		System.out.println(al);						//it is removed, equals() is overridden
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
		
	//insertion operation [elements are moved to right one location]
		al2.add(1, 5); 		//[10, 5, 30, 50, 60, 70, 80, 90, 100]
		System.out.println(al2);
		
	//replacing operation [just random replace in given index location]
		al2.set(3, 1); 		//[10, 5, 30, 1, 60, 70, 80, 90, 100]
		System.out.println(al2);
		
	//sorting objects
		al2.sort(null);
		System.out.println(al2);
	}
}


