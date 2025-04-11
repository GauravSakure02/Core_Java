package collection1;

import java.util.TreeSet;

public class Test16_TreeSet {
	public static void main(String[] args) {
		
	 //objects are stored in adding objects supply default sorting order i.e; ASC order 	
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");	//"c".compareTo("a"); -> 99-97 -> +ve -> "c" stores RIGHT to "a"
		ts1.add("b");	//"b".compareTo("a"); -> 98-97 -> +ve -> RIGHT
						//"b".compareTo("c"); -> 98-99 -> -ve -> "b" stores LEFT of "c"
		System.out.println(ts1); //[a, b, c]/*
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);		//7.compareTo(5); -> 7 - 5 -> +ve -> 7 stores RIGHT to 5
		ts2.add(6);		//6.compareTo(5); -> 6 - 5 -> +ve -> 6 stores RiGHT to 5
						//6.compareTo(7); -> 6 - 7 -> -ve -> 6 stores LEFT  to 7  
		System.out.println(ts2); //[5, 6, 7]
		System.out.println();
		
	//storing objects by passing custom comparator for sorting object in DESC order	
		TreeSet<String> ts3 = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
		ts3.add("a");  
		ts3.add("c");  //cmpr.compare("c", "a"); -> "a" - "c" -> 97-99 -> -ve -> "c" stored LEFT "a"
		ts3.add("b");  //cmpr.compare("b", "a"); -> "a" - "b" -> 97-98 -> -ve -> "b" stored LEFT "a"
					   //cmpr.compare("b", "c"); -> "c" - "b" -> 99-98 -> +ve -> "b" stored RIGHT "c"	
		System.out.println(ts3); //[c, b, a]

		TreeSet<Integer> ts4 = new TreeSet<>((io1, io2) -> io2.compareTo(io1));
		ts4.add(5);
		ts4.add(7);
		ts4.add(6);
		System.out.println(ts4);
		
		TreeSet<Object> ts5 = new TreeSet<>();
		ts5.add("a");
		ts5.add("c");
		//ts5.add(5);
		//ts5.add(null);
		System.out.println();
		
	//========== adding custom class objects ================
		TreeSet<Ex> ts6 = new TreeSet<>();
	//	ts6.add(new Ex(5, 6));	//RE: CCE because Ex is not Comparable type
		System.out.println(ts6);
		
		TreeSet<Sa> ts7 = new TreeSet<>();
		ts7.add(new Sa(5, 3));	//no CCE because Sa is Comparable type
		ts7.add(new Sa(7, 1));	
		ts7.add(new Sa(6, 5));	
		System.out.println(ts7);
		
		TreeSet<Sa> ts8 = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
		ts8.add(new Sa(5, 3));	
		ts8.add(new Sa(7, 1));	
		ts8.add(new Sa(6, 5));	
		System.out.println(ts8);
		
		TreeSet<Sa> ts9 = new TreeSet<>((s1, s2) -> s1.getY() - s2.getY());
		ts9.add(new Sa(5, 3));	
		ts9.add(new Sa(7, 1));	
		ts9.add(new Sa(6, 5));	
		System.out.println(ts9);
		
		TreeSet<Sa> ts10 = new TreeSet<>((s1, s2) -> s2.getY() - s1.getY());
		ts10.add(new Sa(5, 3));	
		ts10.add(new Sa(7, 1));	
		ts10.add(new Sa(6, 5));	
		System.out.println(ts10);
		System.out.println();
		
//====== storing non-comparible object by passing custom comparator ==============================================================================
		
		TreeSet<Ex> ts11 = new TreeSet<>((e1, e2) -> e1.getX() - e2.getX());
		ts11.add(new Ex(5, 3));			//case #1: return [CO - AO] -> ASCo without duplicates	
		ts11.add(new Ex(7, 1));	
		ts11.add(new Ex(6, 5));	
		ts11.add(new Ex(6, 5));	
		System.out.println(ts11);

		TreeSet<Ex> ts12 = new TreeSet<>((e1, e2) -> e2.getX() - e1.getX());
		ts12.add(new Ex(5, 3));			//case #2: return [AO - CO] -> DESCo without duplicates	
		ts12.add(new Ex(7, 1));	
		ts12.add(new Ex(6, 5));	
		ts12.add(new Ex(6, 5));	
		System.out.println(ts12);

		TreeSet<Ex> ts13 = new TreeSet<>((e1, e2) -> 1);
		ts13.add(new Ex(5, 3));			//case #3: return +ve; -> IO with duplicates	
		ts13.add(new Ex(7, 1));	
		ts13.add(new Ex(6, 5));	
		ts13.add(new Ex(6, 5));	
		System.out.println(ts13);
		
		TreeSet<Ex> ts14 = new TreeSet<>((e1, e2) -> -1);
		ts14.add(new Ex(5, 3));			//case #4: return -ve; -> Reverse IO with duplicates	
		ts14.add(new Ex(7, 1));	
		ts14.add(new Ex(6, 5));	
		ts14.add(new Ex(6, 5));	
		System.out.println(ts14);
		
		TreeSet<Ex> ts15 = new TreeSet<>((e1, e2) -> 0);
		ts15.add(new Ex(5, 3));			//case #5: return 0; -> only 1st object is stored	
		ts15.add(new Ex(7, 1));	
		ts15.add(new Ex(6, 5));	
		ts15.add(new Ex(6, 5));	
		System.out.println(ts15);
		
		
/**/	
		
	}
}