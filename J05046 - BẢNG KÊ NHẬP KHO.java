import java.util.*;

public class Main {  
    static long ck(long total, long sl){
        if(sl>10) return total/20;
        if(sl>=8) return total/50;
        if(sl>=5) return total/100;
        return 0;
    }
    static String getCode(String name){
        String[] a = name.split("\\s+");
        return Character.toString(a[0].charAt(0)).toUpperCase() + Character.toString(a[1].charAt(0)).toUpperCase();
    }

    static class ob {
        String code, name;
        long ck, sum, total;
        public ob(String code, String name, long sl, long price){
            this.code = code;
            this.name = name;
            this.total = price*sl;
            this.ck = ck(this.total, sl);
            this.sum = this.total - this.ck;
        }

        public String toString() {
            return code + " " + name + " " + ck + " " + sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            String code = getCode(name);
            if(hm.get(code) == null) hm.put(code, 1);
            else hm.put(code, hm.get(code) + 1);
            a.add(new ob(code + String.format("%02d", hm.get(code)), name, sc.nextLong(), sc.nextLong()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
