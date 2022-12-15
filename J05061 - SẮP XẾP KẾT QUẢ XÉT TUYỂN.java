import java.util.*;
import java.text.*;

public class Main {  

    static Double plus(Double a, Double b){
        if(a>=8 && b>=8) return 1.0;
        if(a>=7.2 && b>=7.2) return 0.5;
        return 0.0;
    }

    static class ob {
        String code, name, result;
        Double sum, plus;
        Long fin, age;

        public ob(int i, String name, String date, double a, double b){
            this.code = "PH" + String.format("%02d", i);
            this.name = name;
            this.age = 2021 - Long.parseLong(date.split("/")[2]);
            this.plus = plus(a, b);
            this.sum = (a + b)/2 + this.plus;
            this.fin = Math.min(Math.round(this.sum), 10);
            if(this.fin < 5) this.result = "Truot";
            else if(this.fin<7) this.result = "Trung binh";
            else if(this.fin == 7) this.result = "Kha";
            else if(this.fin == 8) this.result = "Gioi";
            else this.result = "Xuat sac";
        }

        public String toString() {
            return code + " " + name + " " + age + " " + fin + " " + result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        a.sort((ob x, ob y) -> {
            if(x.fin.compareTo(y.fin) == 0) return x.code.compareTo(y.code);
            return y.fin.compareTo(x.fin);
        });
        a.forEach(e -> System.out.println(e));
    }
}
