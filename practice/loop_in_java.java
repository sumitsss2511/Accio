import java.security.Principal;
import java.util.Scanner;

public class loop_in_java {
    public static void main(String[] args){
        // for(initialization,condition,updation)

            // for(int i=0;i<=10; i+=2){
            //     for(int j=i; j<=i+1; j++){
            //         System.out.println(i+1 +" "+ j);
            //     }
                // System.out.println(i);

                
        // String s = "Hello World";
        // int n = s.length();
        // for(int i = 0; i<n; i++){
        //     System.out.println(s.charAt(i));
        // }

        // for(;;){
        //     System.out.println("Hello World"); //loop infinite
        // }

        // int n = 24;
        // int s = 0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         s+=1;
        //     }
        // }
        // if(s==2){
        //     System.out.println("prime number");
        // }
        // else{
        //     System.out.println("not a prime number");
        // }
        // System.out.println(s);

        // int ar[] = {1,2,3,4,5,6,7,8,9,10};
        // int la = ar.length;
        // for(int i=0; i<la; i++){
        //     System.out.println(ar[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];
        int la = ar.length;
        for(int i=0; i<la; i++){
            ar[i]=sc.nextInt();
            
        }

        for(int i=0;i<la;i++){
            System.out.println(ar[i]);

        }
        
    }
}
