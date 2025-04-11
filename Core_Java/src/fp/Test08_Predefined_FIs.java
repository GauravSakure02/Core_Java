package fp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Test08_Predefined_FIs {
	public static void main(String[] args) {
		
		Consumer<Integer> c1 = value -> System.out.println(value);	
		Consumer<Double>  c2 = value -> System.out.println(value);	
		Consumer<String>  c3 = value -> System.out.println(value);	
		
		Consumer<Integer> c4 = System.out::println;
		Consumer<Double>  c5 = System.out::println;	
		Consumer<String>  c6 = System.out::println;	
		
		Consumer<int[]>  c7 = value -> {
			
			for(int i=0; i<value.length; i++){
				System.out.println(value[i]);
			}
		};	

		c1.accept(10);
		c2.accept(10.0);
		c3.accept("HK");

		c4.accept(20);
		c5.accept(20.0);
		c6.accept("NiT");
		
		c7.accept(new int[]{5, 6, 7, 8, 9});
		System.out.println();
	//===========================================================
		Supplier<Integer> s1 = () -> 5;
		Supplier<Double>  s2 = () -> 6.7;
		Supplier<String>  s3 = () -> "HK";
		Supplier<int[]>   s4 = () -> new int[]{50, 60, 70, 80, 90};
		
		int		res1 = s1.get(); System.out.println(res1);
		double	res2 = s2.get(); System.out.println(res2);
		String  res3 = s3.get(); System.out.println(res3);
		int[]	res4 = s4.get(); System.out.println(java.util.Arrays.toString(res4));
		System.out.println();
	//===========================================================
		Function<Integer, String> f1 = (i) -> "function res1: "+ i;
		Function<String, Integer> f2 = (s) -> s.length();
		
		String  res5 = f1.apply(10); System.out.println(res5);
		int		res6 = f2.apply("HK"); System.out.println(res6);
		System.out.println();
	//===========================================================
		Predicate<Integer> p1 = (i) -> i<0;
		Predicate<Integer> p2 = (i) -> i%2==0;
		
		System.out.println(p1.test(-10));
		System.out.println(p1.test(10));
		
		System.out.println(p2.test(10));
		System.out.println(p2.test(15));
	}
}