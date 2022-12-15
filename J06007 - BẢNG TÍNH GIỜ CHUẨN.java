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

    static class gv {
        String code, name;
        double sum;

        public gv(String s) {
            sum = 0;
            String[] a = s.trim().split(" ",2);
            code = a[0];
            name = a[1];
        }

        public boolean is(String s) {
            return s.startsWith(code);
        }
        
        @Override
        public String toString() {
            return name + ' ' + String.format("%.2f", sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
        }
        n = sc.nextInt();
        ArrayList<gv> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= n; i++)
            a.add(new gv(sc.nextLine()));
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String gcode = sc.next();
            sc.next();
            double time = sc.nextDouble();
            int ind = 0;
            for (int j = 0; j < n; j++) {
                if (a.get(j).is(gcode)) {
                    ind = j;
                    break;
                }
            }
            a.get(ind).sum += time;
        }
        a.forEach(e -> System.out.println(e));
    }
}
