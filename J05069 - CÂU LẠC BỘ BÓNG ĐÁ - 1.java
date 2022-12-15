import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name;
        Long price;

        public ob(String code, String name, long price){
            this.code = code;
            this.name = name;
            this.price = price;
        }
    }

    static class ob2{
        ob o;
        String code;
        long total;
        public ob2(ob o, String code, long sl){
            this.code = code;
            this.o = o;
            this.total = o.price*sl;
        }

        @Override 
        public String toString(){
            return code + " " + o.name + " " + total;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        ArrayList<ob2> b= new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            String code = sc.next();
            String ccode = code.substring(1,3);
            int ind = 0;
            for(int j=0;j<n;j++){
                if(a.get(j).code.compareTo(ccode) == 0){
                    ind = j;
                    break;
                }
            }
            b.add(new ob2(a.get(ind), code, sc.nextLong()));
        }
        b.forEach(e -> System.out.println(e));
    }
}
