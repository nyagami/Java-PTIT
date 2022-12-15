import java.util.*;
import java.io.*;

public class Main {
    static String stdName(String s) {
        String[] n = s.toLowerCase().split("[' ']+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            if (n[i].length() == 0)
                continue;
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static int dm(char c) {
        if (c == 'A')
            return 100;
        if (c == 'B')
            return 500;
        return 200;
    }

    static class kh {
        String code, name;
        int in, out, vat, sum;

        public kh(int i, String n, char c, int f, int l) {
            code = String.format("KH%02d", i);
            name = stdName(n);
            int d = dm(c);
            int e = l - f;
            in = Math.min(e, d) * 450;
            out = Math.max(0, e - d) * 1000;
            vat = out / 20;
            sum = in + out + vat;
        }
        @Override
        public String toString() {
            return code + ' ' + name + in + ' ' + out + ' ' + vat + ' ' + sum;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<kh> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new kh(i, sc.nextLine(), sc.next().charAt(0), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<kh>() {
            @Override
            public int compare(kh a, kh b) {
                return b.sum - a.sum;
            }
        });
        a.forEach(e -> System.out.println(e));
    }
}
