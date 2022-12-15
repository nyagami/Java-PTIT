import java.util.*;
import java.io.*;

/**
 *
 * @author GIGABYTE
 */
public class Main {
    static class ob{
        String code, name, i, lt, th;

        public ob(String a, String b, String c, String d, String e){
            code = a;
            name = b;
            i = c;
            lt = d;
            th = e;
        };

        public boolean oke(){
            if(th.compareTo("Truc tuyen") == 0) return true;
            if(th.endsWith(".ptit.edu.vn")) return true;
            return false;
        }
        
        @Override
        public String toString(){
            return code + ' ' + name + ' ' + i + ' ' + lt + ' ' + th;
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        while(n-->0) a.add(new ob(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        a.sort((ob x, ob y) -> {
            return x.code.compareTo(y.code);
        });
        a.forEach(e ->{
            if(e.oke()) System.out.println(e);
        });
    }
}
