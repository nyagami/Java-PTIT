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
            String code = sc.next();
            if(code.startsWith("GD")){
                if(gd == 0) gd++;
                else{
                    code = "NV" + code.substring(2);
                }
            }else if(code.startsWith("TP")){
                if(tp<3) tp++;
                else{
                    code = "NV" + code.substring(2);
                }
            }else if(code.startsWith("PP")){
                if(pp<3) pp++;
                else{
                    code = "NV" + code.substring(2); 
                }
            }
            a.add(new ob(code, sc.nextLine().trim()));
        }
        a.sort((ob x, ob y) -> {
            if(x.hs == y.hs) return x.code.compareTo(y.code);
            return y.hs.compareTo(x.hs);
        });
        int q = sc.nextInt();
        while(q-->0){
            String code = sc.next();
            a.forEach(e -> {
                if(e.cv.compareTo(code) == 0) System.out.println(e);
            });
            System.out.println();
        }
    }
}
