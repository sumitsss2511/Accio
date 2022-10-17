import java.util.Arrays;
import java.util.Scanner;

public class second_largest_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); 
        }
        // Arrays.sort(a); 
        int temp =0;
        for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] < a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    

        System.out.println(a[1]);

        // int b[] = {23,45,12,5,76,10};
        // Arrays.sort(b);
        // for(int i=0; i<b.length; i++){
            
        // }
        // System.out.println(b[1]);

        
    }
}
