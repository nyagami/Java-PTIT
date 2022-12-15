import java.io.*;
import java.util.*;

public class Main {
    
    static class lich {
        mh o;
        int thu, kip;
        String gv, room, code, mcode;

        public lich(int i, mh o, int thu, int kip, String gv, String room) {
            this.code = String.format("HP%03d", i);
            this.o = o;
            this.thu = thu;
            this.kip = kip;
            this.gv = gv;
            this.room = room;
        }
        @Override
        public String toString() {
            return code + " " + o.name + " " + thu + " " + kip + " " + room;
        }
    }

    static class mh {
        String code, name;
        int num;

        public mh(String code, String name, int num) {
            this.code = code;
            this.name = name;
            this.num = num;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner mh_sc = new Scanner(new File("MONHOC.in"));
        Scanner lich_sc = new Scanner(new File("LICHGD.in"));
        HashMap<String, mh> hmh = new HashMap<>();
        int n = mh_sc.nextInt();
        for (int i = 0; i < n; i++) {
            mh_sc.nextLine();
            mh x = new mh(mh_sc.nextLine(), mh_sc.nextLine(), mh_sc.nextInt());
            hmh.put(x.code, x);
        }
        mh_sc.close();
        int m = lich_sc.nextInt();
        ArrayList<lich> a = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String code = lich_sc.next();
            int thu = lich_sc.nextInt();
            int kip = lich_sc.nextInt();
            lich_sc.nextLine();
            lich x = new lich(i, hmh.get(code), thu, kip, lich_sc.nextLine(), lich_sc.nextLine());
            a.add(x);
        }
        String gv = lich_sc.nextLine();
        a.sort((lich x, lich y) -> {
            if (x.thu == y.thu) {
                if (x.kip == y.kip)
                    return x.gv.compareTo(y.gv);
                return x.kip - y.kip;
            }
            return x.thu - y.thu;
        });
        System.out.printf("LICH GIANG DAY GIANG VIEN %s:\n", gv);
        a.forEach(e -> {
            if(e.gv.compareTo(gv) == 0) System.out.println(e);
        });
    }
}
