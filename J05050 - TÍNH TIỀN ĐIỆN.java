import java.util.*;

public class Main {  
    static long x(String s){
        if(s.compareTo("KD") == 0) return 3;
        if(s.compareTo("NN") == 0) return 5;
        if(s.compareTo("TT") == 0) return 4;
        return 2;
    }

    static long plus(long total, long dis){
        if(dis<50) return 0;
        if(dis<=100) return Math.round(total/100.0*35);
        return total;
    }

    static class ob {
        String code;
        Long x, total, plus, sum, dis;
        public ob(int i, String type, long pre, long af){
            this.code = "KH" + String.format("%02d", i);
            this.x = x(type);
            this.dis = af - pre;
            this.total = this.dis * this.x * 550;
            this.plus = plus(this.total, this.dis);
            this.sum = this.total + this.plus;
        }

        public String toString() {
            return code + " " + this.x + " " + this.total + " " + this.plus + " " + this.sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
           a.add(new ob(i+1, sc.next(), sc.nextLong(), sc.nextLong()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
