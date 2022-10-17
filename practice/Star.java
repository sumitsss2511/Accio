import java.util.*;
import java.io.*;

public class Star {
    public static void main(String[] args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=0; i<n; i++){
            System.out.print(" ");
        }
        for(j=0; j<=i; j++){
            System.out.print("* ");
        } 
        System.out.println();

    }
}
