import java.util.Scanner;

// Java code to print all possible subarrays for given array
// using recursion

public class possible_subarray {

	// Recursive function to print all possible subarrays
	// for given array
	static void printSubArrays(int[] arr, int start, int end)
	{
		// Stop if we have reached the end of the array
		if (end == arr.length)
			return;
		// Increment the end point and start from 0
		else if (start > end)
			printSubArrays(arr, 0, end + 1);
		// Print the subarray and increment the starting
		// point
		else {
			// System.out.print("[");
			for (int i = start; i < end; i++)
				System.out.print(arr[i] + " ");
				System.out.print(arr[end]+" , ");
				printSubArrays(arr, start + 1, end);
		}
		return;
	}

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
		printSubArrays(arr, 0, 0);
	}
}

