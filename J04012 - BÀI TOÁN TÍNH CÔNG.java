import java.util.*;

public class Main {
    static int sup(String s) {
        if (s.compareTo("GD") == 0)
            return 250000;
        if (s.compareTo("PGD") == 0)
            return 200000;
        if (s.compareTo("TP") == 0)
            return 180000;
        return 150000;
    }

    static int ex(int l, int days) {
        if (days >= 25)
            return l / 5;
        if (days >= 22)
            return l / 10;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("NV01 %s ", sc.nextLine());
        int x = sc.nextInt();
        int days = sc.nextInt();
        String cv = sc.next();
        int plus = ex(x*days, days);
        int pc = sup(cv);
        System.out.printf("%d %d %d %d", x * days, plus, pc, x * days + plus + pc);
    }
}
