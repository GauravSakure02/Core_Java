package fp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import constructor.Student;

public class Test13_StreamAPI {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Stream<Integer> stream1 = Stream.of(2, 3, 4, 5, 6, 7, 8); 	//1. source
		stream1.forEach(ele -> System.out.println(ele));			//2. terminal operation (retrieve and print elements)
		System.out.println();
		
		IntStream stream2 = IntStream.range(2, 8); 					//1. source
		stream2.forEach(ele -> System.out.println(ele));			//2. terminal operation (retrieve and print elements)
		System.out.println();
		
		int[] ia = {2, 3, 4, 5, 6, 7, 8};							
		IntStream stream3 = Arrays.stream(ia); 						//1. source
		stream3.forEach(System.out::println);						//2. terminal
		System.out.println();
						
		List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7, 8);
		Stream<Integer> stream4 = list1.stream();					//1. source
		stream4.forEach(System.out::println);						//2. terminal
		System.out.println();
		
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
            Stream<String> stream5 = br.lines();
            stream5.forEach(System.out::println);
            System.out.println();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
		System.out.println("====================");
		Stream<Integer> stream6 = list1.stream();					//1. source  -> [2, 3, 4, 5, 6, 7, 8]
		Stream<Integer> stream7 = stream6.filter(ele -> ele%2==0);	//2. I Oper  -> [2, 4, 6, 8]
		stream7.forEach(System.out::println);						//3. T Oper  -> O/P: 2 4 6 8
		System.out.println();
		
		//Stream API -> SELECT query with WHERE condition 
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
		
	//============== Collection with custom objects ============
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
		System.out.println();
		
	//== Sorting students with custom comparator ============	
		studentsList.stream()	//supplying custom sorting order with Comparator
					.sorted((st1, st2) -> st1.getSno()-st2.getSno())
					.forEach(System.out::print);
		System.out.println();
		System.out.println(studentsList);
		System.out.println();
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
		
		if(list.stream().anyMatch(string -> string.startsWith("a")))
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
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

