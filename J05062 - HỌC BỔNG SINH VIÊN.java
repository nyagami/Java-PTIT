import java.util.*;

public class Main {

    static String cleanName(String s) {
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++)
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        return String.join(" ", a);
    }   

    static class ob {
        String name, type;
        int i, rl;
        Double gpa;
        public ob(int i, String name, double gpa, int rl) {
            this.i = i;
            this.name = cleanName(name);
            this.gpa = gpa;
            this.rl = rl;
            if (gpa >= 3.6 && rl >= 90)
                type = "XUATSAC";
            else if (gpa > 3.2 && rl >= 80)
                type = "GIOI";
            else if (gpa > 2.5 && rl >= 70)
                type = "KHA";
            else
                type = "KHONG";
        }

        @Override
        public String toString() {
            return name + ": " + type;
        }
    }

    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ob(i, sc.nextLine(), sc.nextDouble(), sc.nextInt()));
        }
        a.sort((ob x, ob y) -> {
            if (y.gpa == x.gpa)
                return y.rl - x.rl;
            return y.gpa.compareTo(x.gpa);
        });
        int i = m;
        while (i < n) {
            if (a.get(i).gpa.compareTo(a.get(i - 1).gpa) == 0)
                i++;
            else
                break;
        }
        while (i < n) {
            a.get(i).type = "KHONG";
            i++;
        }
        for (i = 0; i < n; i++) {
            for (ob x : a) {
                if(x.i == i) System.out.println(x);
            }
        }
    }
}
