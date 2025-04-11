package objectclass;
public class Test06_toString {
	public static void main(String[] args) {
		
		Example e1 = new Example(10, 20);
		Sample 	s1 = new Sample(10, 20);
		
		System.out.println(e1); //Example@4aa8f0b4
						//e1.toString(); -> is not overridden and returns CN@hc
											//from java.lang.Object class
		
		System.out.println(s1); //Sample@a
						//s1.toString(); -> is overridden in Sample class
										//executed from Sample class and 
										//returns state
				/*
				 * public void println(Object obj) {
				 *    String msg = obj.toString();
				 *  	----
				 * 		---- msg is printing
				 * 		----
				 * }
				 */
		String str1 = new String("abc");
		System.out.println(str1);
						//str1.toString(); -> is overridden in String class
											//executed from String class and 
											//returns state
		Integer io1 = new Integer(50);
		System.out.println(io1);
						//io1.toString(); -> is overridden in Integer class 
											//executed from String class and 
											//returns state
		
		Sample2 s2 = new Sample2(10, 20);
		System.out.println(s2);
						//s2.toString()	-> in class Sample2 toString is overridden
										//-> s2 object data is printed
	}
}