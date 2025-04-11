package stringhandling;
public class Test02_Diff_String_SB_SB {
	public static void main(String[] args) {
			String s1 = new String("HK"); //immutable object
			System.out.println(s1); //HK

			s1.concat("NiT"); 
					//concat method does not store given argument characters
					//in the current object that is s1 pointing object
				//it creates new String object with the characters "HKNiT" 
			//and returns that new object to our program
			//because we have not stored that returned object, it is destroyed
			//the s1 variable still pointing to the old string object "HK"
			
			System.out.println(s1);//HK
			System.out.println();
		//=============================================================================	
			StringBuffer sb1 = new StringBuffer("HK");  //mutable object
			System.out.println(sb1); //HK
			sb1.append("NiT");	//append method stores the arguemnt String object 
					//characters in this current StringBuffer object at the end of
					//existing characters and returns the result
			System.out.println(sb1);//HKNiT
			System.out.println();
		//=============================================================================
			
			StringBuilder sb2 = new StringBuilder("HK");  //mutable object
			System.out.println(sb2); //HK
			sb2.append("PW");	//append method stores the argument String object 
					//characters in this current StringBuilder object at the end of  
					//existing characters and returns the result
			System.out.println(sb2);//HKPW
			
			
	}
}