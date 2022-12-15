import java.util.*;
public class Main {

    static class ob {
        String code, name, field, last;

        public ob(int i, String name, String s){
            code = "GV" + String.format("%02d", i);
            String[] a = name.split("\\s+");
            last = a[a.length - 1];
            this.name = name;
            String[] b = s.split("\\s+");
            field = "";
            for(String x:b){
                field+=Character.toString(x.charAt(0)).toUpperCase();
            }
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
        a.sort((ob x, ob y) -> {
            if(x.last.compareTo(y.last) == 0) return x.code.compareTo(y.code);
            return x.last.compareTo(y.last);
        });
        a.forEach(e -> System.out.println(e));
    }
}
