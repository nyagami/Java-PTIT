import java.io.*;
import java.util.*;

public class Main {

    static String cleanName(String s) {
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++)
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        return String.join(" ", a);
    }

    static class sv {
        String code, name, cl, mail;

        public sv(String code, String name, String cl, String mail) {
            this.code = code;
            this.name = cleanName(name);
            this.cl = cl;
            this.mail = mail;
        }

        public String toString() {
            return code + " " + name + " " + cl;
        }
    }
    
    static class dn {
        ArrayList<sv> a;
        String code, name;
        int max;
        
        public dn(String code, String name, int max) {
            a = new ArrayList<>();
            this.code = code;
            this.name = name;
            this.max = max;
        }

        @Override
        public String toString() {
            String s = String.format("DANH SACH THUC TAP TAI %s:\n", name);
            String[] arr = new String[Math.min(a.size(), max)];
            for (int i = 0; i < arr.length; i++)
                arr[i] = a.get(i).toString();
            return s + String.join("\n", arr);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sv_sc = new Scanner(new File("SINHVIEN.in"));
        Scanner dn_sc = new Scanner(new File("DN.in"));
        Scanner tt_sc = new Scanner(new File("THUCTAP.in"));
        HashMap<String, sv> hsv = new HashMap<>();
        HashMap<String, dn> hdn = new HashMap<>();
        int nsv = sv_sc.nextInt();
        sv_sc.nextLine();
        for (int i = 0; i < nsv; i++) {
            sv x = new sv(sv_sc.nextLine(), sv_sc.nextLine(), sv_sc.nextLine(), sv_sc.nextLine());
            hsv.put(x.code, x);
        }
        sv_sc.close();
        int ndn = dn_sc.nextInt();
        for (int i = 0; i < ndn; i++) {
            dn_sc.nextLine();
            dn x = new dn(dn_sc.nextLine(), dn_sc.nextLine(), dn_sc.nextInt());
            hdn.put(x.code, x);
        }
        dn_sc.close();
        int ntt = tt_sc.nextInt();
        for (int i = 0; i < ntt; i++) {
            String sv_code = tt_sc.next();
            String dn_code = tt_sc.next();
            dn x = hdn.get(dn_code);
                x.a.add(hsv.get(sv_code));
        }
        hdn.forEach((k, v) -> {
            v.a.sort((sv x, sv y) -> x.code.compareTo(y.code));
        });
        int q = tt_sc.nextInt();
        while (q-- > 0) {
            String code = tt_sc.next();
            System.out.println(hdn.get(code));
        }
    }
}
