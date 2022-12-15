import java.util.*;
import java.text.*;
public class Main {
    static class ob {
        String code, name, address;
        long v;
        Double time;

        public ob(String name, String address, String time) {
            this.name = name;
            this.address = address;
            this.code = "";
            for (String i : address.trim().split("\\s+"))
                this.code += i.charAt(0);
            for (String i : name.trim().split("\\s+"))
                this.code += i.charAt(0);
            SimpleDateFormat f = new SimpleDateFormat("HH:mm");
            try{
                this.time = (f.parse(time).getTime() - f.parse("6:00").getTime()) / 3600000.0;
                this.v = Math.round(120.0 / this.time);
            } catch (ParseException e) {
                
            }
        }

        @Override 
        public String toString() {
            return code + " " + name + " " + address + " " + v + " Km/h";
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((ob x, ob y) -> x.time.compareTo(y.time));
        a.forEach(e -> System.out.println(e));
    }
}
