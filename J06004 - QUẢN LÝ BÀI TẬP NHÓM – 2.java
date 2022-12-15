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

    static class sv {
        String msv, name, sdt;
        int index;
        
        public sv(String m, String n, String s, int i) {
            msv = m;
            name = n;
            sdt = s;
            index = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<sv> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new sv(sc.nextLine(), sc.nextLine(), sc.next(), sc.nextInt()));
        }
        a.sort((sv x, sv y) -> {
            return x.msv.compareTo(y.msv);
        });
        String[] thread = new String[m + 1];
        sc.nextLine();
        for (int i = 1; i <= m; i++)
            thread[i] = sc.nextLine();
        a.forEach(e -> {
            System.out.printf("%s %s %s %d %s\n", e.msv, e.name, e.sdt, e.index, thread[e.index]);
        });
    }
}
