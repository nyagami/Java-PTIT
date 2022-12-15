import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name;

        public ob(String code, String name){
            this.code = code;
            this.name = name;
        }
    }

    static long x(String s){
        long y = Long.parseLong(s.substring(1,3));
        if (1<=y && y<=3){
            if(s.charAt(0)=='A') return 10;
            if(s.charAt(0)=='B') return 10;
            if(s.charAt(0)=='C') return 9;
            return 8;
        }
        if(4<=y && y<=8){
            if(s.charAt(0)=='A') return 12;
            if(s.charAt(0)=='B') return 11;
            if(s.charAt(0)=='C') return 10;
            return 9;
        }
        if(9<=y && y<=15){
            if(s.charAt(0)=='A') return 14;
            if(s.charAt(0)=='B') return 13;
            if(s.charAt(0)=='C') return 12;
            return 11;
        }
        if(s.charAt(0)=='A') return 20;
        if(s.charAt(0)=='B') return 16;
        if(s.charAt(0)=='C') return 14;
        return 13;
    }
    static class ob2 {
        ob o;
        String code, name;
        Long x, sum;
        public ob2(ob o, String code, String name, long sday, long days){
            this.o = o;
            this.code = code;
            this.name = name;
            this.x = x(code);
            this.sum = sday*days*this.x*1000;
        }

        @Override
        public String toString(){
            return code + " " + name + " " + o.name + " " + sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.next(), sc.nextLine()));
        }
        int m = sc.nextInt();
        ArrayList<ob2> b = new ArrayList<>();
        for(int j=0;j<m;j++){
            ob o = a.get(0);
            String code = sc.next();
            for(int i=0;i<n;i++){
                if(a.get(i).code.compareTo(code.substring(3)) == 0){
                    o = a.get(i);
                    break;
                }
            }
            sc.nextLine();
            b.add(new ob2(o, code, sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        b.forEach(e -> System.out.println(e));
    }
}
