package stringhandling;
public class Test03_Relation_bw_S_SB_SB {
	public static void main(String[] args) {
		
			String 			s1 	= "Hari";
//			StringBuffer 	sb1 = "Hari";  //CE: i c t String cannot be converted to SBuffer
//			StringBuilder 	sb2 = "Hari";  //CE: i c t String cannot be converted to SBuilder
			
			StringBuffer sb3 = new StringBuffer("Hari");
			StringBuilder sb4 = new StringBuilder("Hari");
			
			System.out.println(s1);
			System.out.println(sb3);
			System.out.println(sb4);
	}
}