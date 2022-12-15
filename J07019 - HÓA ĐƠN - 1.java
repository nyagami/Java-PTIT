import java.util.*;
import java.io.*;
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
        String code, name;
        int l1, l2;

        public stuff(String m, String n, int x, int y) {
            code = m;
            name = n;
            l1 = x;
            l2 = y;
        }

        public boolean isStuff(String c) {
            return c.startsWith(code);
        }

        public int getPrice(String s) {
            if (s.charAt(2) == '1')
                return l1;
            return l2;
        }
    }
    
    static class bill {
        String code, name;
        int cnt, off, sum, fin;

        public bill(int i, String c, String name, int count, int price) {
            code = c + '-' + String.format("%03d", i);
            this.name = name;
            cnt = count;
            sum = price * cnt;
            if (cnt >= 150) {
                off = sum / 2;
            } else if (cnt >= 100) {
                off = sum * 3 / 10;
            } else if (cnt >= 50) {
                off = sum * 15 / 100;
            }else off = 0;
                
            fin = sum - off;
        }

        @Override
        public String toString() {
            return code + ' ' + name + ' ' + off + ' ' + fin;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s_sc = new Scanner(new File("DATA1.in"));
        Scanner b_sc = new Scanner(new File("DATA2.in"));
        int n = s_sc.nextInt();
        ArrayList<stuff> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s_sc.nextLine();
            a.add(new stuff(s_sc.nextLine(), s_sc.nextLine(), s_sc.nextInt(), s_sc.nextInt()));
        }
        int m = b_sc.nextInt();
        ArrayList<bill> b = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String code = b_sc.next();
            int cnt = b_sc.nextInt();
            stuff x = a.get(0);
            for (int j = 0; j < n; j++) {
                if (a.get(j).isStuff(code)) {
                    x = a.get(j);
                    break;
                }
            }
            b.add(new bill(i, code, x.name, cnt, x.getPrice(code)));
        }
        b.forEach(e -> {
            System.out.println(e);
        });
    }
}
