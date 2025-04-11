package collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test07_Performance_V_AL_LL_adding {
	public static void main(String[] args) {
		
		Vector<Integer> 	v1 = new Vector<Integer>();
		ArrayList<Integer> 	al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		long time1, time2;
		
		time1 = System.currentTimeMillis();
		for(int i=1; i<=1000000; i++) {
			v1.add(new Integer(i));
		}
		time2 = System.currentTimeMillis();
		System.out.println("V  adding time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
		for(int i=1; i<=1000000; i++) {
			al.add(new Integer(i));
		}
		time2 = System.currentTimeMillis();
		System.out.println("al adding time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
		for(int i=1; i<=1000000; i++) {
			ll.add(new Integer(i));
		}
		time2 = System.currentTimeMillis();
		System.out.println("ll adding time: "+ (time2-time1));
		System.out.println();

	}
}