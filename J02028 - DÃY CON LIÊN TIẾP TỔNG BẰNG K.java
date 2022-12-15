import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            int l = 0, r = 0;
            long sum = a[l];
            boolean check = false;
            while(l<n){
                if(sum == k){
                    check = true;
                    break;
                }
                if(l==r || sum < k){
                    r++;
                    if(r==n) break;
                    sum+=a[r];
                }else if(sum > k){
                    sum-=a[l];
                    l++;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
