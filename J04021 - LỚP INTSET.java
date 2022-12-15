import java.util.*;

public class Main {
    static class IntSet {
        TreeSet<Integer> a;

        public IntSet(int[] arr) {
            a = new TreeSet<>();
            for (int i : arr)
                a.add(i);
        }

        public IntSet union(IntSet b) {
            b.a.forEach(e -> this.a.add(e));
            return this;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    public static void main895189(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

