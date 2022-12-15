import java.util.*;
public class Main {
    static char up(char x) {
        if ('a' <= x && x <= 'z')
            return (char) ((int) x - 32);
        return x;
    }

    static String re(String name) {
        String[] a = name.split("[' ']+");
        String r = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == 0)
                continue;
            String s = Character.toString(up(a[i].charAt(0))) + a[i].substring(1);
            r += s + " ";
        }
        return r;
    }

    static class student {
        String code, name, method, mail;

        public student(String c, String n, String m, String em) {
            code = c;
            name = n;
            method = m;
            mail = em;
        }

        public boolean big(student b) {
            if (code.compareTo(b.code) > 0)
                return true;
            return false;
        }

        public String toString() {
            return code + " " + name + ' ' + method + " " + mail;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Ke toan", "DCKT");
        hm.put("Cong nghe thong tin", "DCCN");
        hm.put("An toan thong tin", "DCAT");
        hm.put("Vien thong", "DCVT");
        hm.put("Dien tu", "DCDT"); 
        Scanner sc = new Scanner(System.in);
        ArrayList<student> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String nganh = sc.nextLine();
            String s = hm.get(nganh);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", nganh.toUpperCase());
            a.forEach(e -> {
                if(s.compareTo("DCCN") == 0 || s.compareTo("DCAT") == 0){
                    if(e.code.indexOf(s) > -1 && !e.method.startsWith("E")) System.out.println(e);
                }else{
                    if(e.code.indexOf(s) > -1) System.out.println(e);
                }
            });
        }
    }
}
