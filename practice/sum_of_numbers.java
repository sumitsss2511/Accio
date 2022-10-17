import java.util.*;
import java.lang.*;
import java.io.*;

public class sum_of_numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;

        // for(int i=0; i<=n; i++){
        //     sum+=i;

            
            
        // }
        System.out.println(sum);
	}
}
