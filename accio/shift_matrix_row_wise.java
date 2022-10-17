// Java program to shift k elements in a
// matrix.
import java.util.Scanner;

public class shift_matrix_row_wise {
	
	static int N = 3;
	
	// Function to shift first k elements
	// of each row of matrix.
	static void shiftMatrixByK(int [][]mat,
									int k)
	{
		if (k > N) {
			System.out.print("Shifting is"
						+ " not possible");
			return;
		}
		
		int j = 0;
		while (j < N) {
			
			// Print elements from index k
			for (int i = k; i < N; i++)
				System.out.print(mat[j][i] + " ");
				
			// Print elements before index k
			for (int i = 0; i < k; i++)
				System.out.print(mat[j][i] + " ");
				
			System.out.println();
			j++;
		}
	}
	
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int k = sc.nextInt();
        int mat[][] = new int[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        
					// { {1, 2, 3, 4},
					// {5, 6, 7, 8},
					// {9, 10, 11, 12},
					// {13, 14, 15, 16} };
		
		// Function call
		shiftMatrixByK(mat, k);
	}
}

// This code is contributed by Manish Shaw
// (manishshaw1)
