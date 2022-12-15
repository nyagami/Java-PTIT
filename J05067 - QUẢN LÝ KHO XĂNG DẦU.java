import java.util.*;
import java.text.*;

public class Main {  

    static String getName(String s){
        if(s.endsWith("BP")) return "British Petro";
        if(s.endsWith("ES")) return "Esso";
        if(s.endsWith("SH")) return "Shell";
        if(s.endsWith("CA")) return "Castrol";
        if(s.endsWith("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    static long tax(long x, String code){
        if(code.endsWith("TN")) return 0;
        if(code.startsWith("X")) return x*3/100;
        if(code.startsWith("D")) return x*7/200;
        return x/50;
    }

    static long price(String code){
        if(code.startsWith("X")) return 128000;
        if(code.startsWith("D")) return 11200;
        return 9700;
    }

    static class ob {
        String code, name;
        Long price, tax, sum, fin;

        public ob(String code, long sl){
            this.code = code;
            this.name = getName(code);
            this.price = price(code);
            this.sum = this.price * sl;
            this.tax = tax(this.sum, code);
            this.fin = this.sum + this.tax;
        }

        public String toString() {
            return code + " " + name + " " + price + " " + tax + " " + fin;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.next(), sc.nextLong()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
