import java.util.*;
import java.io.*;
public class Main {
    
    static String cleanName(String s) {
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        }
        return String.join(" ", a);
    }

    static String cleanDate(String s) {
        String[] a = s.split("/");
        for (int i = 0; i <= 1; i++) {
            a[i] = String.format("%02d", Integer.parseInt(a[i]));
        }
        return String.join("/", a);
    }

    static class ob {
        String code, name, cl, date;
        Double gpa;

        public ob(int i, String name, String cl, String date, double gpa) {
            this.code = "B20DCCN" + String.format("%03d", i);
            this.name = cleanName(name);
            this.cl = cl;
            this.date = cleanDate(date);
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + cl + " " + date + " " + String.format("%.02f", gpa);
        }
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ob(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
