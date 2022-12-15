import java.util.Scanner;
import java.util.TreeSet;
import java.io.IOException;
import java.io.File;

public class Main{
    static void Try(int start, int num, String r, int[] a, int[] ans, int n, TreeSet<String> ts){
        if(num > 1) ts.add(r);
        if(num == n) return;
        for(int i=start; i<n; i++){
            if(num == 0){
                ans[num] = a[i];
            }else if(a[i] > ans[num-1]){
                ans[num] = a[i];
            }else continue;
            Try(i+1, num+1, r + Integer.toString(a[i]) + " ", a, ans, n ,ts);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        TreeSet<String> ts = new TreeSet<>();
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] ans = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        Try(0, 0, "", a, ans, n, ts);
        ts.forEach(s -> System.out.println(s));
    }
}
