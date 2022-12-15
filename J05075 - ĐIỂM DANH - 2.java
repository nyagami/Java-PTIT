import java.util.*;
import java.text.*;

public class Main {  

    static class ob {
        String code, name, cl, status;
        int ck;

        public ob(String code, String name, String cl){
            this.code = code;
            this.name = name;
            this.cl = cl;
            this.ck = 10;
            this.status = "";
        }

        public void get(String s){
            int cntv = 0, cntm = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == 'v') cntv++;
                else if(s.charAt(i) == 'm') cntm++;
            }
            this.ck -= cntv*2 + cntm;
            this.ck = Math.max(this.ck, 0);
            if(this.ck == 0) this.status = "KDDK";
        }

        @Override
        public String toString(){
            return code + " " + name + " " + cl + " " + ck + " " + status;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=0;i<n;i++){
            String code = sc.next();
            String status = sc.next();
            for(int j=0;j<n;j++){
                if(a.get(j).code.compareTo(code) == 0){
                    a.get(j).get(status);
                    break;
                }
            }
        }
        String cl = sc.next();
        a.forEach(e ->{
            if(e.cl.compareTo(cl) == 0) System.out.println(e);
        });
    }
}
