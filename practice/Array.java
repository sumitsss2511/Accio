import java.util.*;
import java.io.*;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10 ,11 ,12}};
        int b = a.length;
        int c = a[2].length;
        int d = a[0].length;
        System.out.println(b) ;
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(a[1][1]); 

        for(int i=0; i<b; i++){
            for(int j=0; j<d; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
        }


        for(int i=0; i<b; i++){
            for(int j=0; j<d; j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
    }
    
}
