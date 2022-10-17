import java.util.Scanner;

public class expert_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int J = sc.nextInt();
        // int G = sc.nextInt();
        // int P = sc.nextInt();
        // int C = sc.nextInt();
        // int fj = 100-J;
        // int fg = 100-G;
        // int fp = 100-P;
        // int fc = 100-C;

        // int not_expert = fj+fg+fp+fc;
        // System.out.println(fj+"  "+fj+"  "+not_expert);
        // System.out.println("Expert in all the four languages : "+(100-not_expert)+"%");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number*i);
        }
    }
    
}
