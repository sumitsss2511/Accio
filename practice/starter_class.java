public class starter_class {
    public static void main(String[] args){
        // int long double long string 
        //array rotation

        int a[] = {1,2,3,4,5};
        int n = a.length;
        int k = 3;

        for(int i=1; i<=k; i++){
            int t = a[n-1];
            for(int j=n-2; j>=0; j--){
                a[j+1] = a[j];
            }
            a[0]=t;
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }

    }
}
