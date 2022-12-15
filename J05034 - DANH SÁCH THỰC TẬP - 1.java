import java.util.*;
import java.text.*;
public class Main {
    
    static class ob {
        String code, name, cl, mail, dn;
        int stt;
        public ob(int i, String code, String name, String cl,String mail, String dn){
            stt = i;
            this.code = code;
            this.name = name; 
            this.cl = cl;
            this.mail = mail;
            this.dn = dn;
        }

        public boolean is(String s){
            return s.compareTo(dn) == 0;
        }

        public String toString() {
            return stt + " " + code + ' ' + name + ' ' + cl + ' ' + mail + ' ' + dn;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((ob x, ob y) -> {
            return x.name.compareTo(y.name);
        });
        int q = sc.nextInt();
        while(q-->0){
            String s = sc.next();
            a.forEach(e ->{
                if(e.is(s)) System.out.println(e);
            });
        }
    }
}
