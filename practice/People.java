import java.util.Scanner;


public class People {
    public static void main(String[] args){
        int row,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        row= sc.nextInt();
        for(i=0; i<row; i++){
            for(j=2*(row-i); j>=0; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}