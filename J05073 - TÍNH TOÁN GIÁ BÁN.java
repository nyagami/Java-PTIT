import java.io.*;
import java.util.*;

public class Main {

    static double ship(String code, long sum){
        if(code.startsWith("T")) return sum*0.04;
        if(code.startsWith("C")) return sum*0.03;
        if(code.startsWith("D")) return sum*0.025;
        return sum*0.005;
    }

    static double tax(String code, long sum){
        if(code.startsWith("T")) return sum*0.29;
        if(code.startsWith("C")) return sum*0.1;
        if(code.startsWith("D")) return sum*0.08;
        return sum*0.02;
    }

    static class ob{
        String code;
        Long price, sl, sum;
        Double sell, tax, ship;

        public ob(String code, long price, long sl){
            this.code = code;
            this.price = price;
            this.sl = sl;
            this.sum = price * sl;
            this.tax = tax(code, this.sum);
            this.ship = ship(code, this.sum);
            if(code.endsWith("C")) this.tax *= 0.95;
            this.sell = this.sum*1.0 + this.tax + this.ship;
            this.sell *= 1.2;
            this.sell /= this.sl;
        }

        @Override
        public String toString(){
            return code + " " + String.format("%.2f", sell);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ob> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.next(), sc.nextLong(), sc.nextLong()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
