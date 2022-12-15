package nyagami;

import java.util.Scanner;

public class test{
    static int[][] trans(int[][] a, int n, int m){
        int[][] b = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) b[i][j] = a[j][i];
        }
        return b;
    }
    static int[][] mul(int[][] a, int[][]b, int n, int m){
        int res[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<m; k++) sum+=a[i][k]*b[k][j];
                res[i][j] = sum;
            }
        }
        return res;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ts=1; ts<=t; ts++){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) a[i][j] = sc.nextInt();
            }
            int[][] b = trans(a, n, m);
            int[][] res = mul(a, b, n, m);
            System.out.printf("Test %d:\n", ts);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%d ", res[i][j]);
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
