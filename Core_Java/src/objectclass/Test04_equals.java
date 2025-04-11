package objectclass;
public class Test04_equals {
	public static void main(String[] args) {
		
		Example e1 = new Example(5, 6);
		Example e2 = new Example(5, 6);
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2)); 
							//return this[e1] ==  obj[e2];
		System.out.println();
	//==========================================================	
		Sample s1 = new Sample(5, 6);
		Sample s2 = new Sample(5, 6);

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
							//return this[s1].x == obj[s2].x;
		System.out.println();
	//=========================================================
		
		String str1 = new String("a");
		String str2 = new String("b");
		String str3 = new String("b");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println();
		
	//=========================================================
		Integer io1 = new Integer(50); 
		Integer io2 = new Integer(60); 
		Integer io3 = new Integer(60);
		
		System.out.println(io1 == io2);
		System.out.println(io2 == io3);
		System.out.println(io1.equals(io2));
		System.out.println(io2.equals(io3));
		System.out.println();
	//=========================================================
	  //Differences between == operator and equals() method?
	//=========================================================
		
	//#1:	
		int i1 = 10;
		int i2 = 20;
		Example e3 = new Example(5, 6);
		Example e4 = new Example(5, 6);

		System.out.println(i1 == i2);
		System.out.println("done"); 
		System.out.println(e3 == e4);

//		System.out.println(i1.equals(i2)); //CE:
		System.out.println(e3.equals(e4)); 
		System.out.println();
		
	//#2:
		Sample s3 = new Sample(5, 6);
		Sample s4 = new Sample(5, 6);
		
		System.out.println(e3 == e4);
		System.out.println(s3 == s4);

		System.out.println(e3.equals(e4)); 
		System.out.println(s3.equals(s4)); 
		System.out.println();
		
	//#3:
//		System.out.println(e3 == s3);
		System.out.println(e3.equals(s3));
		System.out.println(s3.equals(e3));
		System.out.println();
		
	//#4: 
		Example e5 = null;
		System.out.println(e1 == e5);		//false
		System.out.println(e5 == e1);		//false
		System.out.println(null == e1);		//false
		System.out.println(null == null);	//true
		System.out.println(null == e5);		//true
		System.out.println();
		
		System.out.println(e1.equals(e5));
//		System.out.println(e5.equals(e1)); 		//RE: NPE
//		System.out.println(null.equals(e1)); 	//CE: null can not be dereferenced
//		System.out.println(null.equals(null));	//CE: null can not be dereferenced
		/**/
	}
}
