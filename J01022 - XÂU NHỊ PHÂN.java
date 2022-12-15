package nyagami;

import java.util.Scanner;

public class test{
    
    static long[] f = new long[94];
    
    static int Try(int n, long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k<=f[n-2]) return Try(n-2,k);
        return Try(n-1,k-f[n-2]);
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        f[0]=0;
        f[1]=1;
        for(int i=2;i<94;i++){
            f[i]=f[i-1]+f[i-2];
        }
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
        sc.close();
    }
}
