import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name, c;

        public ob(String code, String name, String c){
            this.code = code;
            this.name = name;
            this.c = c;
        }
    }
    
    static long sum(String c, long total){
        if(c.compareTo("A") == 0) return total/100*8;
        if(c.compareTo("B") == 0) return total/100*5;
        if(c.compareTo("C") == 0) return total/100*2;
        return 0;
    }

    static class ob2 {
        ob o;
        String code;
        Long slnhap, price, slxuat;
        Long sumnhap, sumxuat;
        public ob2(ob o, String code, long slnhap, long price, long slxuat){
            this.o = o;
            this.code = code;
            this.slnhap = slnhap;
            this.price = price;
            this.slxuat = slxuat;
            this.sumnhap = slnhap*price;
            this.sumxuat = price*slxuat + sum(o.c, price*slxuat);
        }

        @Override
        public String toString(){
            return code + " " + o.name + " " + sumnhap + " " + sumxuat;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        ArrayList<ob2> b = new ArrayList<>();
        for(int j=0;j<m;j++){
            ob o = a.get(0);
            String code = sc.next();
            for(int i=0;i<n;i++){
                if(a.get(i).code.compareTo(code) == 0){
                    o = a.get(i);
                    break;
                }
            }
            b.add(new ob2(o, code, sc.nextLong(), sc.nextLong(), sc.nextLong()));
        }
        b.forEach(e -> System.out.println(e));
    }
}
