import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();//It is the number to calculate factorial    
        if(number>=0 && number<=10){
            int i,fact=1;  
            if(number==0){
                System.out.println(number);   
            }
            else{
                for(i=1;i<=number;i++){    
                    fact=fact*i;    
                }    
                System.out.println(fact);    
            }
        }
        else{
            System.out.println(number);    
            
        }
        
    }
    
}
