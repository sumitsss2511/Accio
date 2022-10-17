
// Java program for above approach
import java.util.Scanner;

class wave_print_matrix {
    public static void WavePrint(int m, int n, int[][] arr) {
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        WavePrint(R, C, arr);
    }
}
