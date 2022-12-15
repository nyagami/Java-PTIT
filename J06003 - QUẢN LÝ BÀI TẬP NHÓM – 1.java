import java.util.*;

public class non {
    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static class sv {
        String msv, name, sdt;
        int index;
        
        public sv(String m, String n, String s, int i) {
            msv = m;
            name = n;
            sdt = s;
            index = i;
        }

        @Override
        public String toString(){
            return msv + " " + name + " " + sdt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<sv> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new sv(sc.nextLine(), sc.nextLine(), sc.next(), sc.nextInt()));
        }
        String[] thread = new String[m + 1];
        sc.nextLine();
        for (int i = 1; i <= m; i++)
            thread[i] = sc.nextLine();
        int q = sc.nextInt();
        while(q-->0){
            int th = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", th);
            a.forEach(e -> {
                if(e.index == th) System.out.println(e);
            });
            System.out.printf("Bai tap dang ky: %s\n", thread[th]);
        }
    }
}
