import java.util.*;
import java.text.*;

public class Main {  

    static String fF(double x){
        if((int) x == x) return String.format("%.0f", x);
        return String.format("%.1f", x);
    }

    static class ob {
        String code, name, result;
        Double sum, fin, pri;

        public ob(String code, String name, double a, double b, double c){
            this.code = code;
            this.name = name;
            if(code.startsWith("KV1")) this.pri = 0.5;
            else if(code.startsWith("KV2")) this.pri = 1.0;
            else if(code.startsWith("KV3")) this.pri = 2.5;
            this.sum = a*2 + b + c;
            this.fin = this.sum + this.pri;
            if(this.fin >= 24) this.result = "TRUNG TUYEN";
            else this.result = "TRUOT";
        }

        public String toString() {
            return code + " " + name + " " + fF(pri) + " " + fF(fin) + " " +this.result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        a.sort((ob x, ob y) ->{
            if(x.fin.compareTo(y.fin) == 0) return x.code.compareTo(y.code);
            return y.fin.compareTo(x.fin);
        });
        a.forEach(e -> System.out.println(e));
    }
}
