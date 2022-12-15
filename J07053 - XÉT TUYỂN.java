import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main{
    static String stdDate(String s){
        String[] a = s.split("/");
        String r = "";
        for(String i:a){
            if(i.length() == 1) i = "0" + i;
            r = r + i + '/';
        }
        return r;
    }
    static String stdName(String s){
        String[] n = s.toLowerCase().split("[' ']+");
        String r = "";
        for(int i=0; i<n.length; i++){
            if(n[i].length() == 0) continue;
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }
    static class person{
        String code, name, date, type;
        double lt, th, plus;
        int sum, age;
        public person(int i, String n, String d, double a, double b){
            code = String.format("PH%02d", i);
            name = stdName(n);
            date = stdDate(d);
            age = 2021 - Integer.parseInt(date.split("/")[2]);
            lt = a;
            th = b;
            if(a >= 8 && b >= 8) plus = 1;
            else if(a >= 7.5 && b >= 7.5) plus = 0.5;
            else plus = 0;
            sum = (int)(Math.round((lt + th) / 2 + plus));
            if(sum > 10) sum = 10;
            if(sum >= 9) type = "Xuat sac";
            else if(sum == 8) type = "Gioi";
            else if(sum == 7) type = "Kha";
            else if(sum >= 5) type = "Trung binh";
            else type = "Truot";
        }

        @Override
        public String toString(){
            return code + ' ' + name + age + ' ' + sum + ' ' + type;
        }
    }
    public static void main(String[] arg)throws IOException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        ArrayList<person> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            a.add(new person(i, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
