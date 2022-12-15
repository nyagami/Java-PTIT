import java.util.*;
import java.text.*;

public class Main {  

    static Long x(String s){
        return Long.parseLong(s.substring(2));
    }

    static int count(ArrayList<ob> a, ob x){
        String s = x.code.substring(0,2);
        int cnt = 0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i).code.startsWith(s)) cnt++;
        }
        return cnt;
    }

    static Long plus(String s){
        if(s.startsWith("HT")) return (long)2000000;
        if(s.startsWith("HP")) return (long)900000;
        return (long)500000;
    }

    static class ob {
        String code, name;
        Long sal, plus, sum, x;

        public ob(String code, String name, long sal){
            this.code = code;
            this.name = name;
            this.x = x(code);
            this.plus = plus(code);
            this.sal = sal;
            this.sum = this.sal*this.x + this.plus;
        }

        public String toString() {
            return code + " " + name + " " + x + " " + plus + " " + sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            ob x = new ob(sc.nextLine(), sc.nextLine(), sc.nextLong()) ;
            if(x.code.startsWith("HT") && count(a, x) == 1 || x.code.startsWith("HP") && count(a, x) == 2) continue;
            a.add(x);
        }
        a.forEach(e -> System.out.println(e));
    }
}
