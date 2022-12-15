import java.util.*;
import java.text.*;
public class Main {
    static String toD(String s) {
        String[] d = s.split("/");
        for (int i = 0; i <= 1; i++) {
            while (d[i].length() < 2)
                d[i] = "0" + d[i];
        }
        return d[0] + "/" + d[1] + "/" + d[2];
    }

    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static class sv {
        String code, name, gender, address, date, tax, day;
        float gpa;
        
        public sv(int i, String n, String c, String d, String add, String t, String day) {
            code = String.format("%05d", i);
            name = stdName(n);
            gender = c;
            date = d;
            address = add;
            tax = t;
            this.day = day;
        }
        
        @Override
        public String toString() {
            return code + ' ' + name + gender + ' ' + date + ' ' + address + ' ' + tax + ' ' + day;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            a.add(new sv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        a.sort((sv x, sv y) -> {
            int c = 0;
            try{
                c = f.parse(x.date).compareTo(f.parse(y.date));
            }catch (ParseException e){

            }
            return c;
        });
        a.forEach(e -> System.out.println(e));
    }
}
