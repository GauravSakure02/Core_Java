package collection1;

import java.util.ArrayList;

public class Test01_College_AL {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(101, "S1", "CJ", 10000));
		al.add(new Student(101, "S2", "OR", 20000));
		al.add(new Student(101, "S3", "HT", 25000));
		al.add(new Student(102, "S4", "CJ", 10000));
		al.add(new Student(102, "S5", "OR", 20000));
		al.add(new Student(102, "S6", "HT", 25000));
		al.add(new Student(102, "S6", "HT", 25000));
		al.add(new Student(103, "S7", "CJ", 10000));
		al.add(new Student(103, "S8", "OR", 20000));
		al.add(new Student(103, "S9", "HT", 25000));

		System.out.println(al);
		System.out.println();
		
		System.out.println(al.contains(new Student(103, "S1", "CJ", 50000)));
		System.out.println(al.contains(new Student(104, "S1", "CJ", 50000)));
		
		int index= al.indexOf(new Student(103, "S1", "CJ", 50000));
		if(index!=-1) {
			Student s = al.get(index);
			System.out.println(s.getSname() + " paid "+ s.getFee()+ " fee for "+ s.getCourse() + " course");
		}else {
			System.out.println("Student is not found with the given details");
		}
		
		/*
		 * For adding a class objects in List implemented collections
		 * and further to find them and remove them, the adding objects class
		 * must override equals() method.
		 * 
		 * If equals() method is not overridden, no CE or no RE, the problem is
		 * the objects added to List are not found and are not removed
		 * 
		 * If we want to find the added objects with new referenced objects with same data
		 * we must override equals() method, by comparing common property and unique property
		 * 
		 * 	for example 
		 * 		 in Student -> compare [course and sno] in two objects
		 * 		 in Employee -> compare [dept and eno]  in two objects
		 * 		 in BankAccount -> compare [branch and accno]  in two objects
		 */
	}
}