import java.util.*;
import java.text.*;
public class Main {
    
    static int sup(String s){
        if(s.compareTo("GD") == 0) return 250000;
        else if(s.compareTo("PGD") == 0) return 200000;
        else if(s.compareTo("TP") == 0) return 180000;
        return 150000;
    }

    static class ob {
        String code, name, cv;
        int sal, days, plus, sup, sum;
        public ob(int i, String name, int sal, int days, String cv){
            code = "NV" + String.format("%02d", i);
            this.name = name;
            this.days = days;
            this.sal = sal*days;
            this.sup = sup(cv);
            if(days>=25) plus = this.sal/5;
            else if(days>=22) plus = this.sal/10;
            else plus = 0;
            sum = this.sal + this.sup + this.plus;
        }

        public String toString() {
            return code+' '+name+" "+sal+" "+plus+" "+sup+" "+sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(i+1, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.println(a.get(i));
            sum+=a.get(i).sum;
        }
        System.out.printf("Tong chi phi tien luong: %d",sum);
    }
}
