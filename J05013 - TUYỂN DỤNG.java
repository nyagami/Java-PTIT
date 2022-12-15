import java.util.*;

public class Main {

    static class ob {
        String code, name, type;
        Double sum;

        public ob(int i, String name, double x, double y) {
            this.code = String.format("TS%02d", i);
            this.name = name;
            if (x > 10)
                x /= 10;
            if (y > 10)
                y /= 10;
            this.sum = (x + y) / 2;
            if (this.sum < 5)
                this.type = "TRUOT";
            else if (this.sum < 8)
                this.type = "CAN NHAC";
            else if (this.sum <= 9.5)
                this.type = "DAT";
            else
                this.type = "XUAT SAC";
        }

        @Override 
        public String toString() {
            return code + " " + name + " " + String.format("%.2f", sum) + " " + type;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ob(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        a.sort((ob x, ob y) -> y.sum.compareTo(x.sum));
        a.forEach(e -> System.out.println(e));
    }
}
