import java.io.*;
import java.util.*;

public class non {
    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static class stuff {
        String code, name, unit;
        long l1, l2;

        public stuff(int i, String n, String m, long x, long y) {
            code = "MH" + String.format("%03d", i);
            name = n;
            unit = m;
            l1 = x;
            l2 = y;
        }

        public boolean isStuff(String c) {
            return c.startsWith(code);
        }
    }

    static class person {
        String code, name, gender, date, address;

        public person(int i, String n, String g, String d, String a) {
            code = "KH" + String.format("%03d", i);
            name = n;
            gender = g;
            date = d;
            address = a;
        }

        public boolean isStuff(String c) {
            return c.startsWith(code);
        }
    
    }
    
    static class bill {
        stuff s;
        String code;
        person p;
        long sum, cnt;

        public bill(int i, stuff a, person b, long cnt) {
            code = "HD" + String.format("%03d", i);
            s = a;
            p = b;
            this.cnt = cnt;
            sum = s.l2 * cnt;
        }
        
        @Override
        public String toString() {
            return code + ' ' + p.name + ' ' + p.address + ' ' + s.name + ' ' + s.unit + ' ' + s.l1 + ' ' + s.l2 + ' '
                    + cnt + ' ' + sum; 
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner kh_sc = new Scanner(new File("KH.in"));
        Scanner mh_sc = new Scanner(new File("MH.in"));
        Scanner hd_sc = new Scanner(new File("HD.in"));
        int n = kh_sc.nextInt();
        ArrayList<person> p = new ArrayList<>();
        kh_sc.nextLine();
        for (int i = 1; i <= n; i++) {
            p.add(new person(i, kh_sc.nextLine(), kh_sc.nextLine(), kh_sc.nextLine(), kh_sc.nextLine()));
        }
        int m = mh_sc.nextInt();
        ArrayList<stuff> a = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            mh_sc.nextLine();
            a.add(new stuff(i, mh_sc.nextLine(), mh_sc.nextLine(), mh_sc.nextLong(), mh_sc.nextLong()));
        }
        int k = hd_sc.nextInt();
        ArrayList<bill> b = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String pcode = hd_sc.next();
            String scode = hd_sc.next();
            long cnt = hd_sc.nextLong();
            stuff s = a.get(0);
            person per = p.get(0);
            for (int j = 0; j < n; j++) {
                if (p.get(j).isStuff(pcode)) {
                    per = p.get(j);
                }
            }
            for (int j = 0; j < m; j++) {
                if (a.get(j).isStuff(scode)) {
                    s = a.get(j);
                }
            }
            b.add(new bill(i, s, per, cnt));
        }
        b.forEach(e -> {
            System.out.println(e);
        });
    }
}
