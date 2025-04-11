package blocks;

import java.util.Scanner;
/*class Example {
	static int a ;

	static {
	   Scanner scn = new Scanner(System.in);	

	   System.out.print("Enter  value for a: ");
	   a = scn.nextInt();

	   System.out.println("from SB a: "+ a);
	}

	public static void main(String[] args) {
	   System.out.println("from MM a: "+ a);
	   m1();
	}

	public static void m1() {
	   System.out.println("from SM a: "+ a);	
	}
}*/
/*
class Example {
	 {
                   System.out.println("IIB");
	 }
                   
	 public static void main(String[] args) {
                   System.out.println("MM");			  
	    Example e1 = new Example(); //DC calling
	 }
}*/

/*class Example {
	 {
                   System.out.println("IIB");
	 }
                  
	 Example() {
                    
	    System.out.println("NPC");	
	 }

	 public static void main(String[] args) {
                   System.out.println("MM");			  
	    Example e1 = new Example(); //NPC calling
	 }
}*/
/*
class Example {
	 {
                   System.out.println("IIB");
	 }
	 Example() {
                    
	    System.out.println("NPC");	
	 }
	 Example(int x) {
                    
	    System.out.println("IPC");	
	 }

	 public static void main(String[] args) {
                   System.out.println("MM");			  
	    Example e1 = new Example();	  //NPC calling
	    Example e2 = new Example(10); //IPC calling
	 }
}*/

class Example {
	 int x;
	 int y;
	 {
	    x = 10;
                   System.out.println("IIB");
	 }
	 Example() {
                   y = 20; 
	    System.out.println("NPC");	
	 }
	 Example(int y) {
                   this.y = y;  
	    System.out.println("IPC");	
	 }
	 public static void main(String[] args) {
	    System.out.println("MM");	
	    Example e1 = new Example();	  //NPC calling
	    Example e2 = new Example(30); //IPC calling
	    System.out.println("e1 object values: "+e1.x+"\t"+e1.y);
	    System.out.println("e2 object values: "+e2.x+"\t"+e2.y);
	 }
}