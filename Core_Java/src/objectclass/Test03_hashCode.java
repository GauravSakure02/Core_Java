package objectclass;
public class Test03_hashCode {
	public static void main(String[] args) {
		
		Example e1 = new Example(5, 6);
		Example e2 = new Example(7, 8);
		Example e3 = new Example(7, 8);
		
		Sample s1 = new Sample(5, 6);
		Sample s2 = new Sample(7, 8);
		Sample s3 = new Sample(7, 8);
									  //ref wise hash code	
		System.out.println(e1.hashCode()); //1252585652
		System.out.println(e2.hashCode()); //2036368507
		System.out.println(e3.hashCode()); //1785210046
		System.out.println();
		      						//state wise hash code
		System.out.println(s1.hashCode()); //5
		System.out.println(s2.hashCode()); //7
		System.out.println(s3.hashCode()); //7
		System.out.println();
		
		//changing state of e1 object, the hash code is not changed
		System.out.println(e1.hashCode()); //1252585652
		e1.setX(15);
		e1.setY(16);
		System.out.println(e1.hashCode()); //1252585652
		
		//changing state of s1 object,  hash code is also changed
		System.out.println(s1.hashCode()); //5
		s1.setX(18);
		s1.setY(19);
		System.out.println(s1.hashCode()); //18
		System.out.println();
								//state wise and ref wise hash code
		System.out.println(s1.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println();

		System.out.println(e1.hashCode());
		System.out.println(System.identityHashCode(e1));
		System.out.println("done");
				
	//=======================================================
	/*	String str1 = new String("a"); 
		String str2 = new String("b"); 
		String str3 = new String("b");

		System.out.println(System.identityHashCode(str1)); //1361960727
		System.out.println(System.identityHashCode(str2)); //739498517
		System.out.println(System.identityHashCode(str3)); //125130493
		
		System.out.println(str1.hashCode()); //97
		System.out.println(str2.hashCode()); //98
		System.out.println(str3.hashCode()); //98 */
	//=======================================================
	/*	Integer io1 = new Integer(50); 
		Integer io2 = new Integer(60); 
		Integer io3 = new Integer(60);
		
		System.out.println(System.identityHashCode(io1)); //914504136
		System.out.println(System.identityHashCode(io2)); //166239592
		System.out.println(System.identityHashCode(io3)); //991505714
		
		System.out.println(io1.hashCode()); //50
		System.out.println(io2.hashCode()); //60
		System.out.println(io3.hashCode()); //60
		*/

	//=================================================================
		java.util.HashSet<Object> hs = new java.util.HashSet<>();
		hs.add("a");				//hc=>97
		hs.add("b");				//hc=>98
		hs.add(97);					//hc=>97
		hs.add(98);					//hc=>98
		hs.add(new Example(97, 0));	//hc=>991505715 (ref wise)
		hs.add(new Sample(97, 0));	//hc=>97
		hs.add(new Sample(99, 0));	//hc=>99
		hs.add('c');				//hc=>99
		System.out.println(hs);

	}
}