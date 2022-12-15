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
        Scanner sc = new Scanner(System.in);
        ArrayList<student> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        while(q-->0){
            String cl = sc.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", cl);
            a.forEach(e -> {
                if(e.method.substring(1, 3).compareTo(cl.substring(2)) == 0) System.out.println(e);
            });
        }
    }
}
