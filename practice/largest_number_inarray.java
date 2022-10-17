public class largest_number_inarray {
    public static void main(String[] args){
        int a[] = {1,4,65,34,26,65,34,8,7,46,74,93,47,101,93,30,28,85,37};
        int n = a.length;
        int mx = a[0];
        int idx = 0;
        for(int i=0; i<n; i++){
            if(a[i]>mx){
                mx = a[i];
                idx= i;

            }
        } 
        System.out.println(mx);     
        System.out.println(idx);

    }
    
}
