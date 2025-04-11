package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test06_Array_SeperateEles_CopyEles {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many object do you want to store?: ");
		int numbeOfValues = scn.nextInt(); scn.nextLine();
		
		int[] ia = new int[numbeOfValues];
		for(int i=0; i<numbeOfValues; i++) {
			System.out.print("Enter value"+(i+1)+": ");
			ia[i] = scn.nextInt();
		}
		System.out.println();
		
		int[] evenArray = new int[numbeOfValues];
		int[] oddArray = new int[numbeOfValues];
		
		int evenArrayIndex = 0;
		int oddArrayIndex = 0;
		
		for(int i=0; i<ia.length; i++) {
			if(ia[i]%2==0)
				evenArray[evenArrayIndex++] = ia[i];
			else
				oddArray[oddArrayIndex++] = ia[i];
		}
		
		int[] finalEvenArray 	= new int[evenArrayIndex]; 
		int[] finalOddArray 	= new int[oddArrayIndex]; 
		
		for(int i=0; i<evenArrayIndex; i++) {
			finalEvenArray[i] = evenArray[i];
		}
		
		for(int i=0; i<oddArrayIndex; i++) {
			finalOddArray[i] = oddArray[i];
		}
		
		System.out.println(Arrays.toString(ia));
		
		System.out.println(Arrays.toString(finalOddArray));
		System.out.println(Arrays.toString(finalEvenArray));
		
	}
}