import java.util.*;

public class Main {  
    static long off(String s, long total){
        if (s.charAt(s.length()-1) == '1') return total/2;
        return total*3/10;
    }

    static class ob {
        String cv, x, code, name;
        Long hs;

        public ob(String code, String name){
            cv = code.substring(0,2);
            x = code.substring(2,4);
            this.code = code.substring(4);
            int stt = Integer.parseInt(this.code);
            if(cv.compareTo("GD") == 0 && stt > 1) cv = "NV";
            else if(cv.compareTo("TP") == 0 || cv.compareTo("PP") == 0){
                if(stt > 3) cv = "NV";
            }
            this.name = name;
            hs = Long.parseLong(x);
        }

        public String toString() {
            return name + " " + cv + " " + code + " " + x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        int gd=0, tp=0, pp=0; 
        for(int i=0;i<n;i++){
            ob x = new ob(sc.next(), sc.nextLine().trim());
            if(x.cv.compareTo("GD") == 0){
                if(gd==0) gd++;
                else x.cv = "NV";
            }else if(x.cv.compareTo("TP") == 0){
                if(tp < 3) tp++;
                else x.cv = "NV"; 
            }else if(x.cv.compareTo("PP") == 0){
                if(pp < 3) pp++;
                else x.cv = "NV";
            }
            a.add(x);
        }
        a.sort((ob x, ob y) -> {
            if(x.hs == y.hs) return x.code.compareTo(y.code);
            return y.hs.compareTo(x.hs);
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String code = sc.nextLine().toLowerCase();
            a.forEach(e -> {
                if(e.name.toLowerCase().contains(code)) System.out.println(e);
            });
            System.out.println();
        }
    }
}
