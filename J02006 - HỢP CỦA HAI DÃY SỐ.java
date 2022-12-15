package nyagami;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;

public class test{
    
    static boolean has(int[] a, int n, int x){
        for(int i=0;i<n;i++) if(a[i]==x) return true;
        return false;
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> h = new TreeSet<>();
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        a.forEach(k -> h.add(k));
        b.forEach(k -> h.add(k));
        h.forEach((k)->{
            System.out.printf("%d ", k);
        });
        sc.close();
    }
}
