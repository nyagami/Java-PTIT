import java.io.*;
import java.util.*;

public class Main {
    
    static class lich {
        int thu, kip;
        String gv, room, code, mcode;

        public lich(int i, String mcode, int thu, int kip, String gv, String room) {
            this.code = String.format("HP%03d", i);
            this.mcode = mcode;
            this.thu = thu;
            this.kip = kip;
            this.gv = gv;
            this.room = room;
        }
        @Override
        public String toString() {
            return code + " " + thu + " " + kip + " " + gv + " " + room;
        }
    }

    static class mh {
        ArrayList<lich> a;
        String code, name;
        int num;

        public mh(String code, String name, int num) {
            a = new ArrayList<>();
            this.code = code;
            this.name = name;
            this.num = num;
        }

        public void sort() {
            a.sort((lich x, lich y) -> {
                if (x.thu == y.thu) {
                    if (x.kip == y.kip)
                        return x.gv.compareTo(y.gv);
                    return x.kip - y.kip;
                }
                return x.thu - y.thu;
            });
        }

        @Override
        public String toString() {
            String s = String.format("LICH GIANG DAY MON %s:\n", name);
            String[] arr = new String[a.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = a.get(i).toString();
            }
            return s + String.join("\n", arr);
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
        for (int i = 1; i <= m; i++) {
            String code = lich_sc.next();
            int thu = lich_sc.nextInt();
            int kip = lich_sc.nextInt();
            lich_sc.nextLine();
            lich x = new lich(i, code, thu, kip, lich_sc.nextLine(), lich_sc.nextLine());
            hmh.get(code).a.add(x);
        }
        String code = lich_sc.next();
        hmh.get(code).sort();
        System.out.println(hmh.get(code));
    }
}
