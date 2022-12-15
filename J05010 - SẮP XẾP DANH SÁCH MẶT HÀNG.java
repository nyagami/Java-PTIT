import java.util.*;
public class Main {
    static String toD(String s) {
        String[] d = s.split("/");
        for (int i = 0; i <= 1; i++) {
            while (d[i].length() < 2)
                d[i] = "0" + d[i];
        }
        return d[0] + "/" + d[1] + "/" + d[2];
    }

    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static class sv {
        String  name, date;
        int code;
        double ex;
        
        public sv(int i, String n, String d, double a, double b) {
            code = i;
            name = n;
            date = d;
            ex = b-a;
        }
        
        @Override
        public String toString() {
            return code + " " + name + ' ' + date + ' ' + String.format("%.2f", ex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new sv(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        a.sort((sv x, sv y) -> {
            return (int)(y.ex - x.ex);
        });
        a.forEach(e -> {
            System.out.println(e);
        });
    }
}
