import java.util.*;
import java.text.*;
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
        float sum;
        
        public sv(int i, String n, String d, float a, float b, float c) {
            code = i;
            name = n;
            date = d;
            sum = a+b+c;
        }
        
        @Override
        public String toString() {
            return code + " " + name + ' ' + date + ' ' + String.format("%.1f", sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new sv(i, sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        a.sort((sv x, sv y) -> {
            if(x.sum == y.sum) return x.code - y.code;
            return (int)(y.sum-x.sum);
        });
        a.forEach(e -> {
            if(e.sum == a.get(0).sum) System.out.println(e);
        });
    }
}
