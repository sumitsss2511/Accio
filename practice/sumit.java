public class sumit {
    public static void main(String[] args){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(a[2][1]);
        int b = a.length;
        int c = a[0].length;
        for(int i=0; i<b; i++){
            for(int j=0;j<c;j++ ){
                System.out.print(a[i][j]+" ");
     
            }
            System.out.println(" ");
        }

        // for(int i=0; i<b; i++){
        //     for(int j=i; i<c; j++){
        //         System.out.print(a[j][i]+" ");
        //     }
        //     System.out.print(" ");
        }

    }
    
}
