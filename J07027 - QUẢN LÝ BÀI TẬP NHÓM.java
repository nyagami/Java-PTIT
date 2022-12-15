import java.util.*;
import java.io.*;
public class Main {
    static class bt{
        int code;
        String name;
        public bt(int code, String name){
            this.code = code;
            this.name = name;
        }
    }
    static class sv{
        bt o;
        String code, name, sdt;
        public sv(String code, String name, String sdt){
            this.code = code;
            this.name = name;
            this.sdt = sdt;
        }

        @Override
        public String toString(){
            return code + " " + name + " "  + sdt + " " + o.code + " " + o.name;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc_sv = new Scanner(new File("SINHVIEN.in"));
        Scanner sc_bt = new Scanner(new File("BAITAP.in"));
        Scanner sc_gr = new Scanner(new File("NHOM.in"));
        HashMap<String, sv> hsv = new HashMap<>();
        HashMap<Integer, bt> hbt = new HashMap<>();
        ArrayList<sv> a = new ArrayList<>();

        int n = sc_sv.nextInt();
        sc_sv.nextLine();
        for(int i=0;i<n;i++){
            sv x = new sv(sc_sv.nextLine(), sc_sv.nextLine(), sc_sv.nextLine());
            hsv.put(x.code, x);
            a.add(x);
        }

        int m = sc_bt.nextInt();
        sc_bt.nextLine();
        for(int i=1;i<=m;i++){
            bt x = new bt(i, sc_bt.nextLine());
            hbt.put(i, x);
        }

        while(n-->0){
            String msv = sc_gr.next();
            int stt = sc_gr.nextInt();
            hsv.get(msv).o = hbt.get(stt);
        }

        a.sort((sv x, sv y) -> x.code.compareTo(y.code));
        a.forEach(e -> System.out.println(e));
    }
}
