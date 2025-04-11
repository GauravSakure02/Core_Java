package stringhandling;
public class Test04_String_objects {
	public static void main(String[] args) {
		
		String s1 = "Hari";				//1
		String s2 = new String("NiT");	//2
		
		String s3 = "Hari";				//0
		String s4 = new String("NiT");	//1
		
		String s5 = "NiT";				//0
		
		System.out.println(s1 == s3);	//true
		System.out.println(s2 == s4);	//false
		
	}
}