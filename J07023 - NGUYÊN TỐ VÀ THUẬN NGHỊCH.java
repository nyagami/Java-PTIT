import java.io.*;
import java.util.*;

public class non {

    static boolean tn(int x) {
        String s = String.format("%d", x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        s = null;
        return true;
    }

    static int N = 10000;
    static int[] nt = new int[N+5];

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        for (int i = 2; i <= N; i++)
            nt[i] = 1;
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if (nt[i] == 1) {
                for (int u = i; u <= N / i; u++)
                    nt[i * u] = 0;
            }
        }
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        o1.close();
        TreeMap<Integer, Integer> h1 = new TreeMap<>();
        while (!a1.isEmpty()) {
            int e = a1.get(a1.size()-1);
            a1.remove(a1.size() - 1);
            if (nt[e]==1 && tn(e)) {
                if (h1.get(e) == null)
                h1.put(e, 1);
                else
                h1.put(e, h1.get(e) + 1);
            }
        }
        
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        o2.close();
        TreeMap<Integer, Integer> h2 = new TreeMap<>();
        while (!a2.isEmpty()) {
            int e = a2.get(a2.size() - 1);
            a2.remove(a2.size() - 1);
            if (nt[e]==1 && tn(e)) {
                if (h2.get(e) == null)
                    h2.put(e, 1);
                else
                    h2.put(e, h2.get(e) + 1);
            }
        }
        h1.forEach((k, v) -> {
            if (h2.get(k) != null) {
                System.out.printf("%d %d %d\n", k, v, h2.get(k));
            }
        });
    }
}
