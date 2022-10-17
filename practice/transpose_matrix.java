import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args){
        // int i, j;
        // Scanner s = new Scanner(System.in);
        // int row = s.nextInt();
        // int array[][] = new int[row][row];
        // for(i = 0; i < row; i++)
        // {
        //     for(j = 0; j < row; j++) 
        //         {
        //         array[i][j] = s.nextInt();
        //         System.out.print("");
        //         }
        // }
        // System.out.println(row);
        // for(i = 0; i < row; i++)
        //     {
        //         for(j = 0; j < row; j++)
        //         {
        //             System.out.print(array[j][i]+" ");
        //         }
        //         System.out.println(" ");
        //     }

        int i, j;
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int array[][] = new int[N][N];
    for(i = 0; i < N; i++)
    {
        for(j = 0; j < N; j++) 
            {
            array[i][j] = s.nextInt();
            System.out.print("");
            }
    }
    System.out.println(N);
    for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
        
    
    
    
    }
}
