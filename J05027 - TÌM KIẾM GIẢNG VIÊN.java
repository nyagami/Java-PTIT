import java.util.*;
public class Main {

    static String first(String s){
        String[] a = s.split("\\s+");
        String r = "";
        for(String x:a){
            r+=Character.toString(x.charAt(0)).toUpperCase();
        }
        return r;
    }
    
    static class ob {
        String code, name, field, last, lowname;

        public ob(int i, String name, String s){
            code = "GV" + String.format("%02d", i);
            String[] a = name.split("\\s+");
            last = a[a.length - 1];
            this.name = name;
            lowname = name.toLowerCase();
            String[] b = s.split("\\s+");
            field = first(s);
        }

        public String toString() {
            return code + ' ' + name + ' ' + field;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s = sc.nextLine();
            String key = s.toLowerCase();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", s);
            a.forEach(e -> {
                if(e.lowname.contains(key)) System.out.println(e);
            });
        }
    }
}
