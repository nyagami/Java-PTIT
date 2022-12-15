import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    
    static String cleanName(String s) {
        String[] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        }
        return String.join(" ", a);
    }

    static String cleanDate(String s) {
        String[] a = s.split("/");
        for (int i = 0; i <= 1; i++) {
            a[i] = String.format("%02d", Integer.parseInt(a[i]));
        }
        return String.join("/", a);
    }

    static class ob {
        String code, name, gender, strdate, address;
        Long date;

        public ob(int i, String name, String gender, String date, String address) {
            this.code = "KH" + String.format("%03d", i);
            this.name = cleanName(name);
            this.gender = gender;
            this.strdate = cleanDate(date);
            this.address = address;
            try{
                SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
                this.date = f.parse(date).getTime();
            } catch (ParseException e) {
                
            }
        }

        @Override
        public String toString() {
            return code + " " + name + " " + gender + " " + address + " " + strdate;
        }
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new ob(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((ob x, ob y) -> x.date.compareTo(y.date));
        a.forEach(e -> System.out.println(e));
    }
}
