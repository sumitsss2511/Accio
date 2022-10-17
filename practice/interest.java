import java.util.Scanner;

public class interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = 0.10f;
        long p = 100000l;
        int t = 5;
        float rr = 0.01f;

        System.out.println(p+((p*t*r)*rr));


    }
    
}
