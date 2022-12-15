package nyagami;

import java.util.Scanner;
import java.util.TreeSet;

public class test{
    
    static boolean has(int[] a, int n, int x){
        for(int i=0;i<n;i++) if(a[i]==x) return true;
        return false;
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> h = new TreeSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(has(b,m,a[i])){
                h.add(a[i]);
            }
        }
        h.forEach((k)->{
            System.out.printf("%d ", k);
        });
        sc.close();
    }
}
