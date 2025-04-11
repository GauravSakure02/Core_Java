package fp;
class Test{
	public static void main(String[] args) {
		AO2<Integer> a1 = (Integer i1, Integer i2) -> {System.out.println(i1 + i2);};		
		AO2<Float>	a2 = (Float i1, Float i2) -> {System.out.println(i1 + i2);};		
		AO2<String>	a3 = (String i1, String i2) -> {System.out.println(i1 + i2);};		
		
		a1.ao(10, 2);
		a2.ao(10.5F, 2.4F);
		a3.ao("H", "K");
	}
}