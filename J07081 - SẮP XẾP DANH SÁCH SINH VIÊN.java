import java.util.*;
import java.io.*;

public class Main {
    static class ob{
        String first, last, full, msv, sdt, email;
        public ob(String m, String n, String s, String e){
            msv = m;
            sdt = s;
            String[] a = n.trim().split("\\s+");
            first = a[0];
            last = a[a.length-1];
            full = n;
            email = e;
        }

        @Override
        public String toString(){
            return msv + ' ' + full + ' ' + sdt + ' ' + email;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++) a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        a.sort((ob x, ob y) -> {
            if(x.last.compareTo(y.last) == 0){
                if(x.first.compareTo(y.first) == 0){
                    if(x.full.compareTo(y.full) == 0) return x.msv.compareTo(y.msv);
                    return x.full.compareTo(y.full);
                }
                return x.first.compareTo(y.first);
            }
            return x.last.compareTo(y.last);
        });
        a.forEach(e -> System.out.println(e));
    }
}
