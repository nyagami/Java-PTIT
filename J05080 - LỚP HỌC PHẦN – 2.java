import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name, cl;

        public ob(String code, String name,String cl){
            this.code = code;
            this.name = name;
            this.cl = cl;
        }

        @Override 
        public String toString(){
            return code + " " + name + " " + cl;
        }
    }

    static class ob2 {
        ArrayList<ob> a;
        String name;

        public ob2( String name){
            this.name = name;
            this.a = new ArrayList<>();
        }
        
        public void add(ob o){
            this.a.add(o);
        }

        public void out(){
            System.out.printf("Danh sach cho giang vien %s:\n", name);
            a.forEach(e -> System.out.println(e));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, ob2> hm = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            ob o = new ob(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ob2 o2 = new ob2(sc.nextLine());
            if(hm.get(o2.name) == null){
                o2.add(o);
                hm.put(o2.name, o2);
            }else hm.get(o2.name).add(o);
        }
        hm.forEach((k, v) ->{
            v.a.sort((ob x, ob y) -> {
                if(x.code.compareTo(y.code) == 0) return x.cl.compareTo(y.cl);
                return x.code.compareTo(y.code);
            });
        });
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++){
            hm.get(sc.nextLine()).out();
        }
    }
}
