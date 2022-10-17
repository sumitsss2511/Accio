import java.util.Scanner;

public class array_input {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        int column =sc.nextInt();
        int arr[][] = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int a = arr.length;
        int b = arr[0].length;


        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");

        }
    }
    
}
