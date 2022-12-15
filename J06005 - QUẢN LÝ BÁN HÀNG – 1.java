import java.util.*;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<person> p = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            p.add(new person(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        ArrayList<stuff> a = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            sc.nextLine();
            a.add(new stuff(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        int k = sc.nextInt();
        ArrayList<bill> b = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String pcode = sc.next();
            String scode = sc.next();
            long cnt = sc.nextLong();
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
