import java.util.*;

public class Main {  
    static long off(String s, long total){
        if (s.charAt(s.length()-1) == '1') return total/2;
        return total*3/10;
    }

    static class ob {
        String code, name, type;
        Float sum;
        int rank;

        public ob(int i, String name, float sum){
            this.code = "HS" + String.format("%02d", i);
            this.name = name;
            this.sum = sum;
            if(sum >= 9) type = "Gioi";
            else if(sum>=7) type = "Kha";
            else if(sum>=5) type = "Trung Binh";
            else type = "Yeu";
        }

        public String toString() {
            return code + " " + name + " " + String.format("%.1f", sum) + " " + type + " " + String.format("%d", rank);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        ArrayList<ob> b = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            sc.nextLine();
            ob x = new ob(i+1, sc.nextLine(),sc.nextFloat());
            a.add(x);
            b.add(x);
        }
        b.sort((ob x, ob y) -> y.sum.compareTo(x.sum));
        a.forEach(e -> {
            for(int i=0;i<n;i++){
                if(b.get(i).sum.compareTo(e.sum) == 0){
                    e.rank = i+1;
                    break;
                }
            }
            System.out.println(e);
        });
    }
}
