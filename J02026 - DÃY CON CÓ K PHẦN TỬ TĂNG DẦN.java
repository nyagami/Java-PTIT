import java.util.*;
import java.io.*;

public class Main {
    static void Try(int start, int cnt, int k, int[] a, String s){
        if(cnt==k){
            System.out.println(s);
            return;
        }
        for(int i=start; i<a.length;i++){
            Try(i+1, cnt+1, k, a, s+a[i]+' ');
        }
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
            Try(0,0,k,a,"");
        }
    }
}
