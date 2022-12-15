import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    static class ob {
        String code, name;
        Long sl, price, ck, sum;

        public ob(String code, String name, long sl, long price, long ck) {
            this.code = code;
            this.name = name;
            this.sl = sl;
            this.price = price;
            this.ck = ck;
            this.sum = price * sl - ck;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + sl + " " + price + " " + ck + " " + sum;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.nextLong()));
        }
        a.sort((ob x, ob y) -> y.sum.compareTo(x.sum));
        a.forEach(e -> System.out.println(e));
    }
}
