import java.util.*;
import java.text.*;
public class Main {

    static String cleanName(String s) {
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++)
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        return String.join(" ", a);
    }   

    static class ob {
        String code, name;
        long min, total;
        Double hour, rain;

        public ob(int i, String name) {
            this.code = String.format("T%02d", i);
            this.name = name;
        }

        public void getm(String t1, String t2, long total) {
            SimpleDateFormat f = new SimpleDateFormat("hh:mm");
            try{
                min += (f.parse(t2).getTime() - f.parse(t1).getTime())/1000/60;
            } catch (ParseException e) {

            }
            this.total += total;
            this.hour = this.min / 60.0;
            rain = this.total / this.hour;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + String.format("%.2f", rain);
        }
    }

    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        HashMap<String, ob> a = new HashMap<>();
        ArrayList<ob> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String s = sc.nextLine();
            if (a.get(s) == null) {
                a.put(s, new ob(a.size() + 1, s));
                arr.add(a.get(s));
            }
            a.get(s).getm(sc.next(), sc.next(), sc.nextLong());
        }
        arr.forEach(e -> System.out.println(e));
    }
}
