package nyagami;

import java.util.Scanner;

public class test{
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=1;i<n+1;i++){
                a[i] = sc.nextInt();
                a[i]+=a[i-1];
            }
            boolean oke = true;
            for(int i=2;i<n;i++){
                if(a[i-1]==(a[n]-a[i])){
                    System.out.println(i);
                    oke = false;
                    break;
                }
            }
            if(oke) System.out.println(-1);
        }
        sc.close();
    }
}
