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
        String code, name, cl, date;
        float gpa;
        
        public sv(int i, String n, String c, String d, Float s) {
            code = "B20DCCN" + String.format("%03d", i);
            name = stdName(n);
            cl = c;
            date = toD(d);
            gpa = s;
        }
        
        @Override
        public String toString() {
            return code + ' ' + name + cl + ' ' + date + ' ' + String.format("%.2f", gpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new sv(i, sc.nextLine(), sc.next(), sc.next(), sc.nextFloat()));
        }
        Collections.sort(a, new Comparator<sv>() {
            @Override
            public int compare(sv x, sv y){
                if (y.gpa > x.gpa)
                    return 1;
                if (y.gpa < x.gpa)
                    return -1;
                return 0;
            }
        });
        a.forEach(e -> System.out.println(e));
    }
}
