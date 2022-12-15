import java.util.*;

public class Main {  
    static long sub(String s){
        if(s.compareTo("GD") == 0) return 500;
        if(s.compareTo("PGD") == 0) return 400;
        if(s.compareTo("TP") == 0) return 300;
        if(s.compareTo("KT") == 0) return 250;
        return 100;
    }

    static long tu(long total){
        double x = (double) total;
        if(x*2/3<25000) return Math.round(x*2/3/1000)*1000;
        return 25000;
    }

    static class ob {
        String code, name, cv;
        long sub, total, tu, remain;

        public ob(int i, String name, String cv, long sday, long days){
            code = "NV" + String.format("%02d", i);
            this.name = name;
            this.cv = cv;
            this.sub = sub(cv);
            this.total = sday*days;
            this.tu = tu(this.total);
            this.remain = this.total + this.sub - this.tu;
        }

        public String toString() {
            return code + " " + name + " " + sub + " " + total + " " + tu + " " + remain;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        sc.nextLine();
        String cv = sc.nextLine();
        a.forEach(e -> {
            if(e.cv.compareTo(cv) == 0) System.out.println(e);
        });
    }
}
