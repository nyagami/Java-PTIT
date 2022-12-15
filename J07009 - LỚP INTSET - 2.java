import java.util.*;
import java.io.*;
public class non {
    static class IntSet {
        TreeSet<Integer> a;

        public IntSet(int[] arr) {
            a = new TreeSet<>();
            for (int i : arr)
                a.add(i);
        }

        public IntSet(){
            a = new TreeSet<>();
        }

        public IntSet intersection(IntSet b) {
            IntSet o = new IntSet();
            a.forEach(e -> {
                if(b.a.contains(e)) o.a.add(e);
            });
            return o;
        }
        @Override
        public String toString() {
            String s = "";
            Object[] r = a.toArray();
            for (int i = 0; i < r.length; i++)
                s += r[i] + " ";
            return s;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
    public static void main4039462(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}


