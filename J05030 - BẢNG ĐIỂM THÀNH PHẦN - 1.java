import java.util.*;
public class Main {
    
    static class ob {
        String code, name, cl;
        float a, b, c;

        public ob(String code, String name, String cl, float a, float b, float c){
            this.code = code;
            this.name = name;
            this.cl = cl;
            this.a =a;
            this.b=b;
            this.c=c;
        }

        public String toString() {
            return code + ' ' + name + ' ' + cl + String.format(" %.1f %.1f %.1f", a, b, c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        a.sort((ob x, ob y) -> {
            return x.code.compareTo(y.code);
        });
        for(int i=1; i<=n; i++){
            System.out.printf("%d %s\n", i, a.get(i-1));
        }
    }
}
