package cursor;

import java.util.List;

public class Test32_StreamAPI {
	public static void main(String[] args) {
/*		
		Stream<Integer> s1 = Stream.of(2, 3, 4, 5, 6, 7, 8);	//source
		s1.forEach(ele -> System.out.println(ele));				//terminal operation (r and p)
		System.out.println();
		
		Stream<Integer> s2 = Stream.of(2, 3, 4, 5, 6, 7, 8);	//[2, 3, 4, 5, 6, 7, 8]
		Stream<Integer> s3 = s2.filter(ele -> ele%2==0);		//[2, 4, 6, 8]
		s3.forEach(System.out::println);
		System.out.println();
		
		Stream.of(2, 3, 4, 5, 6, 7, 8)							//[2, 3, 4, 5, 6, 7, 8]
				.filter(ele -> ele%2==0)						//[2, 4, 6, 8]
				.forEach(System.out::println);
		System.out.println();
		
		Stream.of(2, 3, 4, 5, 6, 7, 8)							//[2, 3, 4, 5, 6, 7, 8]
				.filter(ele -> ele%2==0)						//[2, 4, 6, 8]
				.map(ele -> ele*10)								//[20, 40, 60, 80]
				.forEach(System.out::println);
		System.out.println();
		
		long count = 
				Stream.of(2, 3, 4, 5, 6, 7, 8)    				//[2, 3, 4, 5, 6, 7, 8]
					.count();
		System.out.println(count);		
		
		count = 
				Stream.of(2, 3, 4, 5, 6, 7, 8)    //[2, 3, 4, 5, 6, 7, 8]
						.filter(ele -> ele%2==0)
						.count();
		System.out.println(count);		

		count = 
				Stream.of(2, 3, 4, 5, 6, 7, 8)    //[2, 3, 4, 5, 6, 7, 8]
						.filter(ele -> ele%2!=0)
						.count();
		System.out.println(count);		
		
		int sum = 
				IntStream.of(2, 3, 4, 5, 6, 7, 8)    //[2, 3, 4, 5, 6, 7, 8]
						.sum();
		System.out.println(sum);		
		
		sum = 
				IntStream.of(2, 3, 4, 5, 6, 7, 8)    //[2, 3, 4, 5, 6, 7, 8]
						.filter(ele -> ele%2==0)
						.sum();
		System.out.println(sum);		
		
		sum = 
				IntStream.of(2, 3, 4, 5, 6, 7, 8)    //[2, 3, 4, 5, 6, 7, 8]
						.filter(ele -> ele%2!=0)
						.sum();
		System.out.println(sum);		
		
		IntStream.of(2, 3, 4, 5, 6, 7, 8)    		//[2, 3, 4, 5, 6, 7, 8]
				.mapToDouble(ele -> (double)ele)
				.forEach(System.out::println);
//===================================================================================
		System.out.println();
		
		int[] ia = {2, 3, 4, 5, 6, 7, 8};							
		IntStream stream2 = Arrays.stream(ia); 						//1. source
		stream2.forEach(System.out::println);						//2. terminal
		System.out.println();
		
//===================================================================================
		List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7, 8);
		Stream<Integer> stream3 = list1.stream();					//1. source
		stream3.forEach(System.out::println);						//2. terminal
		System.out.println();
//===================================================================================
		
		System.out.println("====================");
		Stream<Integer> stream4 = list1.stream();					//1. source
		Stream<Integer> stream5 = stream4.filter(ele -> ele%2==0);	//2. I Oper
		stream5.forEach(System.out::println);						//3. T Oper
//===================================================================================

// Stream API -> SELECT query with WHERE condition 
		list1.stream()						//[2, 3, 4, 5, 6, 7, 8]
			.filter(ele -> ele%2==0)		//[2, 4, 6, 8]
			.forEach(System.out::println);  //output: 2 4 6 8
		
		System.out.println(); 
	//==========================================================
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
	//==============retrieving and printing all objects ==============================================	
		al.stream()
			.forEach(obj -> System.out.print(obj + "  "));
		System.out.println("\n");

	//============== retrieving and printing only Strings (filtering) ============
		al.stream()											//[a, 5, b, 6, c, 7]
			.filter(obj -> obj instanceof String)			//[a, b, c]
			.forEach(obj -> System.out.print(obj + "  "));	//a b c
		System.out.println("\n");
		
	//============== retrieving and printing only Integers (filtering) ============
		al.stream()											//[a, 5, b, 6, c, 7]
			.filter(obj -> obj instanceof Integer)			//[5 ,6, 7]
			.forEach(obj -> System.out.print(obj + "  "));	//5 6 7
		System.out.println();
	//============== retrieving and printing only Even Integers (filtering) ============
		al.stream()											//[a, 5, b, 6, c, 7]
			.filter(obj -> obj instanceof Integer)			//[5, 6, 7]
			.filter(obj -> ((Integer)obj)%2==0)				//[6]
			.forEach(obj -> System.out.print(obj + " "));	//6
		System.out.println();
			
	//============== retrieving and printing only Odd Integers (filtering) ============
		al.stream()											//[a, 5, b, 6, c, 7]
			.filter(obj -> obj instanceof Integer)			//[5, 6, 7]
			.filter(obj -> ((Integer)obj)%2!=0)				//[5, 7]
			.forEach(obj -> System.out.print(obj + " "));	//5, 7
		System.out.println("\n");
		
	//============== Collection with custom objects ==========================
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student(101, "S1", "Core Java", 3500));
		studentsList.add(new Student(101, "S4", "Oracle"   , 2000));
		studentsList.add(new Student(102, "S7", "HTML"     , 2000));
		studentsList.add(new Student(102, "S2", "Core Java", 3500));
		studentsList.add(new Student(102, "S5", "Oracle"   , 2000));
		studentsList.add(new Student(101, "S6", "HTML"     , 2000));
		studentsList.add(new Student(103, "S3", "Core Java", 3500));
		
	//============== retrieving and printing all student objects ============
		studentsList.stream()
					.forEach(System.out::print);
		System.out.println();
		
	//============== retrieving and printing only Core Java student objects ============
		studentsList.stream()
					.filter(student -> student.getCourse().equalsIgnoreCase("Core Java"))
					.forEach(System.out::print);
		System.out.println();
		
	//== Sorting students with default sorting logic given in class student ============	
		studentsList.stream()
					.sorted()	//uses Student class given Comparable.compareTo(-) sorting
					.forEach(System.out::print);
		System.out.println();
		System.out.println(studentsList);
		
	//== Sorting students with custom comparator =======================================	
		studentsList.stream()	//supplying custom sorting order with Comparator
					.sorted((s1, s2) -> (s1.getFee()-s2.getFee())<0?-1:1)
					.forEach(System.out::print);
		System.out.println();
		
		System.out.println(studentsList);
	*/	
//==================================================================================		
		List<String> list = List.of("abc", "bbc", "cbc", "adcb", "acb");
		list.stream()
			.forEach(string -> System.out.print(string + "  "));
		System.out.println();
		
		list.stream()
			.filter(string -> string.startsWith("a"))
			.forEach(string -> System.out.print(string + "  "));
		System.out.println();
		
		list.stream()
			.filter(string -> string.endsWith("b"))
			.forEach(string -> System.out.print(string + "  "));
		System.out.println();
//===========================================================================		
		long count;
		
		count	= list.stream()
						.count();
		System.out.println("count: "+ count);

		count	= list.stream()
						.filter(string -> string.startsWith("a"))
						.count();
		System.out.println("count: "+ count);
		
	
		count	= list.stream()
					.filter(string -> string.contains("c"))
					.count();
		System.out.println("count: "+ count);
//===========================================================================		
		list.stream()
			.map(string -> string.toUpperCase())
			.forEach(string -> System.out.print(string + "  "));
		System.out.println();
//===========================================================================		
		List<String> list2 = 
			list.stream()
				.map(string -> string.toUpperCase())
				.toList();
			
		System.out.println(list2);
//===========================================================================
		if(list.stream().anyMatch(string -> string.startsWith("a")))
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		if(list.stream().anyMatch(string -> string.startsWith("A")))
			System.out.println("Hi");
		else
			System.out.println("Hello");
//===========================================================================	
		if(list.stream().allMatch(string -> string.startsWith("a")))
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		if(list.stream().allMatch(string -> string.contains("c")))
			System.out.println("Hi");
		else
			System.out.println("Hello");
/**/
	}
}


