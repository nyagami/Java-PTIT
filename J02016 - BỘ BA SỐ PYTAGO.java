import java.util.*;
import java.io.*;

public class Main {
    static boolean check(long[] a){
        for(int i=a.length-1;i>=2;i--){
            int j=0, k=i-1;
            while(j<k){
                long x = a[j] + a[k];
                if (x==a[i]) return true;
                if(x>a[i]) k--;
                else j++;
            }
        }
        return false;
    }
    static long sq(Long x){
        return x*x;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sq(sc.nextLong());
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
