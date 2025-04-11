package objectclass;

import java.util.HashSet;

public class Test07_Project_Employee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "HK", "Java", 10000);
		Employee e2 = new Employee(102, "BK", "Acting", 2000);
		Employee e3 = new Employee(102, "BK", "Acting", 2000);
		
		//printing hash code 
		System.out.println("e1 object's hash code: "+ e1.hashCode());
		System.out.println("e2 object's hash code: "+ e2.hashCode());
		System.out.println("e3 object's hash code: "+ e3.hashCode());
		System.out.println();
		
		//comparing objects
		System.out.println("are e1 and e2 objects same?: "+ e1.equals(e2));
		System.out.println("are e3 and e3 objects same?: "+ e3.equals(e3));
		System.out.println();
		
		//printing objects state
		System.out.println("e1 objects data: "+ e1);
		System.out.println("e2 objects data: "+ e2);
		System.out.println("e3 objects data: "+ e3);
		
		//collection code
		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee(101, "E1", "CJ", 10000)); //e1.hC()
		hs.add(new Employee(101, "E1", "CJ", 10000)); //e2.hC(), e2.eq(e1), not stored
		hs.add(new Employee(101, "E1", "AJ", 10000)); //e3.hC()
		hs.add(new Employee(101, "E1", "Or", 10000)); //e4.hC()	
		hs.add(new Employee(102, "E1", "CJ", 10000)); //e5.hC(), e5.eq(e1), stored
		hs.add(new Employee(102, "E1", "AJ", 10000)); //e6.hC(), e6.eq(e3), stored
		hs.add(new Employee(102, "E1", "Or", 10000)); //e7.hC(), e7.eq(e4), stored
		
		System.out.println(hs); //toString()
		
	}
}