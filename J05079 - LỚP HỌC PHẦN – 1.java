import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name;

        public ob(String code, String name){
            this.code = code;
            this.name = name;
        }

        @Override 
        public String toString(){
            return code + " " + name;
        }
    }

    static class ob2 {
        ArrayList<ob> a;
        String code, name;

        public ob2(String code, String name){
            this.code = code;
            this.name = name;
            this.a = new ArrayList<>();
        }
        
        public void add(ob o){
            this.a.add(o);
        }

        public void out(){
            System.out.printf("Danh sach nhom lop mon %s:\n", name);
            a.forEach(e -> System.out.println(e));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, ob2> hm = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            ob2 o2 = new ob2(sc.nextLine(), sc.nextLine());
            ob o = new ob(sc.nextLine(), sc.nextLine());
            if(hm.get(o2.code) == null){
                o2.add(o);
                hm.put(o2.code, o2);
            }else hm.get(o2.code).add(o);
        }
        hm.forEach((k, v) ->{
            v.a.sort((ob x, ob y) -> x.code.compareTo(y.code));
        });
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            hm.get(sc.next()).out();
        }
    }
}
