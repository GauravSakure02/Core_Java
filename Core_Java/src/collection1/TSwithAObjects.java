package collection1;

import java.util.TreeSet;

class A implements Comparable<A> {
	private int x;
	A(int x){
		this.x = x;
	}
	public String toString(){
		return "A("+x+")";
	}
	public int compareTo(A a) {
		//insert code here
		return x;
	}
}

class  TSwithAObjects{
	public static void main(String[] args) {
		TreeSet<A> ts = new TreeSet<A>();
		ts.add( new A(1) );
		ts.add( new A(3) );
		ts.add( new A(1) );
		ts.add( new A(2) );

		A a5 = new A(4);
		ts.add(a5);
		ts.add(a5);

		System.out.println("ts elements: "+ts);
	}
}