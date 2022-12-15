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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<stuff> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new stuff(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        int m = sc.nextInt();
        ArrayList<bill> b = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String code = sc.next();
            int cnt = sc.nextInt();
            stuff x = a.get(0);
            for (int j = 0; j < n; j++) {
                if (a.get(j).isStuff(code)) {
                    x = a.get(j);
                    break;
                }
            }
            b.add(new bill(i, code, x.name, cnt, x.getPrice(code)));
        }
        b.sort((bill x, bill y) -> {
            return y.fin - x.fin;
        });
        b.forEach(e -> {
            System.out.println(e);
        });
    }
}
