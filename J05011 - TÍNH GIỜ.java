import java.util.*;
import java.text.*;
public class Main {

    static class o {
        String code, name, tin, tout;
        Long time;

        public o(String code, String name, String tin, String tout) {
            this.code = code;
            this.name = name;
            this.tin = tin;
            this.tout = tout;
            SimpleDateFormat f = new SimpleDateFormat("HH:mm");
            try {
                time = (f.parse(tout).getTime() - f.parse(tin).getTime()) / 1000;
            } catch (ParseException e) {

            }
        }
        
        @Override
        public String toString() {
            return code + ' ' + name + ' ' + time / 3600 + " gio " + time / 60 % 60 + " phut";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<o> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new o(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((o x, o y) -> {
            return y.time.compareTo(x.time);
        });
        a.forEach(e -> System.out.println(e));
    }
}
