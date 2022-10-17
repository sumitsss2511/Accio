import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Dell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println("welcome " + a);
        // IntStream i = IntStream.range(0, 5);
        // intStream.forEach(System.out::println);

        int i, j, row = a;       
        //Outer loop work for rows  
        for (i=0; i<row; i++)   
        {  
        //inner loop work for space      
        for (j=2*(row-i); j>=0; j--)         
        {  
        //prints space between two stars      
        System.out.print(" ");   
        }   
        //inner loop for columns  
        for (j=0; j<=i; j++ )   
        {
        //prints star      
        System.out.print("* ");   
        }   
        //throws the cursor in a new line after printing each line  
        System.out.println(); 
        }   
    }
}

