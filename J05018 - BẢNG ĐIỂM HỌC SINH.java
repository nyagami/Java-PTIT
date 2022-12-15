import java.util.*;
public class Main {

    static class o {
        String code, name, type;
        Double tbc;

        public o(int code, String name, Double x) {
            this.code = "HS" + String.format("%02d", code);
            this.name = name;
            this.tbc = Math.round(x/12*10)/10.0;
            if (tbc >= 9)
                type = "XUAT SAC";
            else if (tbc >= 8)
                type = "GIOI";
            else if (tbc >= 7)
                type = "KHA";
            else if (tbc >= 5)
                type = "TB";
            else
                type = "YEU";
        }
        
        @Override
        public String toString() {
            return code + ' ' + name + ' ' + tbc + ' ' + type;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<o> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double x = 0;
            for (int j = 0; j < 10; j++) {
                if (j <= 1)
                    x += sc.nextDouble() * 2;
                else
                    x += sc.nextDouble();
            }
            a.add(new o(i, name, x));
        }
        a.sort((o x, o y) -> {
            if (x.tbc.compareTo(y.tbc) == 0)
                return x.code.compareTo(y.code);
            return y.tbc.compareTo(x.tbc);
        });
        a.forEach(e -> System.out.println(e));
    }
}
