import java.util.*;

public class Main {  
    static long xuat(String code, long nhap){
        if(code.charAt(0) == 'A') return Math.round(nhap*0.6);
        else return Math.round(nhap*0.7);
    }
    static long price(String code){
        return code.charAt(4)=='Y'?110000:135000;
    }
    static long tax(String code, long total){
        if(code.charAt(0)=='A'){
            if(code.charAt(4)=='Y') return total*8/100;
            return total*11/100;
        }
        if(code.charAt(4)=='Y') return total*17/100;
            return total*22/100;
    }

    static class ob {
        String code;
        Long nhap, xuat, price, sum, tax;
        public ob(String code, long sl){
            this.code = code;
            this.nhap = sl;
            this.xuat = xuat(code, sl);
            this.price = price(code);
            this.sum = this.xuat * this.price;
            this.tax = tax(code, this.sum);
        }

        public String toString() {
            return code + " " + nhap + " " + xuat + " " + price + " " + sum + " " + tax;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
           a.add(new ob(sc.next(), sc.nextLong()));
        }
        a.sort((ob x, ob y) -> y.tax.compareTo(x.tax));
        String x = sc.next();
        a.forEach(e ->{
            if(e.code.startsWith(x)) System.out.println(e);
        });
    }
}
