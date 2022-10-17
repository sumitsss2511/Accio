import java.util.*;
import java.io.*;
import java.util.Scanner;


public class armstrong_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, number, temp, sum;
        num = sc.nextInt();
        sum = 0;
        number = num;
        while (number>0)
        {
            temp = number % 10;
            sum+= temp*temp*temp ;
            number /= 10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
            System.out.println(num + " is not an Armstrong number");
        }

        
    }
}
