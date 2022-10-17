import java.util.Scanner;

public class RotateMatrix {
    static void rightRotate(int matrix[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            int low = 0, high = N - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // Scanner sn = new Scanner(System.in);
        int N = s.nextInt();
        int NS = s.nextInt();
        // initializing a 3*3 matrix
        int matrix[][] = new int[N][NS];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        // function calling
        rightRotate(matrix, N);
    }
}
