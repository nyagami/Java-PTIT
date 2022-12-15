import java.util.*;

public class Main {
    static String getSub(String s) {
        if (s.startsWith("A"))
            return "TOAN";
        if (s.startsWith("B"))
            return "LY";
        return "HOA";
    }

    static double plus(String s) {
        if (s.endsWith("1"))
            return 2.0;
        if (s.endsWith("2"))
            return 1.5;
        if (s.endsWith("3"))
            return 1.0;
        return 0.0;
    }
    static class ob {
        String code, gcode, name, sub, type;
        Double sum, pri;

        public ob(int i, String name, String gcode, double x, double y) {
            this.code = String.format("GV%02d", i);
            this.gcode = gcode;
            this.name = name;
            this.sub = getSub(gcode);
            this.pri = plus(gcode);
            this.sum = x * 2 + y + this.pri;
            if (this.sum >= 18)
                this.type = "TRUNG TUYEN";
            else
                this.type = "LOAI";
        }

        @Override 
        public String toString() {
            return code + " " + name + " " + sub +" "+ String.format("%.1f", sum) + " " + type;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ob(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        a.sort((ob x, ob y) -> y.sum.compareTo(x.sum));
        a.forEach(e -> System.out.println(e));
    }
}
