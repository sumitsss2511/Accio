import java.util.Scanner;


public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int number = a;
        int reverse = 0;
        boolean b = true;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(a == reverse){
            return true;
            b = true;
        }
        else{
            b = false;
        }
        System.out.println(b);
    }
}
