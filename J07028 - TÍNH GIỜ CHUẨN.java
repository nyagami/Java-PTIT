import java.util.*;
import java.io.*;
public class giochuan{
    static class MH{
        String code, name;
        public MH(String code, String name){
            this.code=code;
            this.name=name;
        }
    }
    
    static class GV{
        String code, name;
        Double sum;
        public GV(String code, String name){
            this.code=code;
            this.name=name;
            this.sum=0.0;
        }
        @Override
        public String toString(){
            return name + " " + String.format("%.2f", sum);
        }
    }

    static class bill{
        MH mh;
        GV gv;
        Double sum;
        public bill(GV gv, MH mh, double sum){
            this.gv = gv;
            this.mh = mh;
            this.sum = sum;
        }
        
    }

    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        HashMap<String, MH> hm1 = new HashMap<>();
        HashMap<String, GV> hm2 = new HashMap<>();
        ArrayList<GV> a = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i=0;i<n;i++){
            MH x = new MH(sc1.next(), sc1.nextLine());
            hm1.put(x.code, x);
        }
        int m = sc2.nextInt();
        for(int i=0;i<m;i++){
            GV x = new GV(sc2.next(), sc2.nextLine().trim());
            hm2.put(x.code, x);
            a.add(x);
        }
        int k = sc3.nextInt();
        for(int i=0;i<k;i++){
            String code1 = sc3.next();
            String code2 = sc3.next();
            hm2.get(code1).sum += sc3.nextDouble();
        }
        a.forEach(e -> System.out.println(e));
    }
}
