import java.util.*;
import java.io.*;

public class Main {
    static int uppper_bound(int l, int r, int[] a, int x){
        if(l>r) return l;
        int mid = (l+r)/2;
        if(a[mid] > x) return uppper_bound(l, mid - 1 , a, x);
        return uppper_bound(mid + 1, r, a, x);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            long sum = 0;
            for(int i=1;i<n;i++){
                int index = uppper_bound(0, i-1, a, a[i]-k);
                sum += (long)(i - index);
            }
            System.out.println(sum);
        }
    }
}
