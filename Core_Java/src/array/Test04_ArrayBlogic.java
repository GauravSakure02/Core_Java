package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test04_ArrayBlogic {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many object do you want to store?: ");
		int numbeOfValues = scn.nextInt(); scn.nextLine();
		
		//dynamic memory
		int[] ia = new int[numbeOfValues];
		System.out.println("Array with default values: "+Arrays.toString(ia));
		
		//dynamic logic for reading and storing values in array object
		for(int i=0; i<numbeOfValues; i++) {
			System.out.print("Enter value"+(i+1)+": ");
			ia[i] = scn.nextInt();
		}
		System.out.println();
		
		int sum, diff;
		sum = diff = ia[0];
		
		for(int i=1; i<ia.length; i++) {
			sum = sum + ia[i];
			diff = diff - ia[i];
		}
		
		System.out.println(Arrays.toString(ia)); 
		System.out.println("Sum: "+ sum);
		System.out.println("Diff: "+ diff);
	}
}