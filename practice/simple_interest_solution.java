import java.util.Scanner;

public class simple_interest_solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int J = R/100;

        System.out.println(J);
        System.out.println(((P*T*J)/100));
        for(int i=0; i<=10; i++){
            for(int j=0; j<=1; j++){
                System.out.print("j"+j);
            }
            System.out.print("i"+i+" ");
            
        }

    }
    
}
