package nyagami;

import java.util.Scanner;

public class test{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++) a[i][j] = sc.nextInt();
            }
            int j = 0;
            for(int i=0; i<n; i++){
                if(j==0){
                    for(; j<n; j++) System.out.printf("%d ", a[i][j]);
                    j=n-1;
                }else{
                    for(; j>=0; j--) System.out.printf("%d ", a[i][j]);
                    j=0;
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
