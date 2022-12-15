import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        // Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int[] b = new int[n];
            for(int i=0;i<n;i++) b[i] = a[i][k-1];
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(b[i] > b[j]){
                        int tmp = b[i];
                        b[i] = b[j];
                        b[j] = tmp;
                    }
                }
            }
            for(int i=0;i<n;i++) a[i][k-1] = b[i];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.printf("%d ",a[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
