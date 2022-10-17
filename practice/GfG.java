// Java program for Maximum of the array
// which is at least twice of other elements
// of the array.
import java.util.*;
import java.lang.*;

public class GfG {
	
	// Function to find the index of Max element
	// that satisfies the condition
	public static int findIndex(int[] arr) {	
		
		// Finding index of max of the array
		int maxIndex = 0;
		for (int i = 0; i < arr.length; ++i)
			if (arr[i] > arr[maxIndex])
				maxIndex = i;
		
		// Returns -1 if the max element is not
		// twice of the i-th element.	
		for (int i = 0; i < arr.length; ++i)			
			if (maxIndex != i && arr[maxIndex] < 2 * arr[i])
				return -1;
		
		return maxIndex;
	}
	
	// Driver function
	public static void main(String argc[]){
		int[] arr = new int[]{3, 6, 1, 0};
		System.out.println(findIndex(arr));
	}
}
