import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
    static long getTime(String s1, String s2) throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s2).getTime() - f.parse(s1).getTime();
    }
    static class kh{
        String code, name, room;
        long d;
        public kh(int i, String n, String r, String cd, String ld){
            code = String.format("%02d", i);
            code = "KH" + code;
            name = n;
            room = r;
            try{
                d = getTime(cd, ld) / (1000 * 60 * 60 * 24) % 365;
            }catch(ParseException e){
                
            }
        }
        public String toString(){
            return String.format("%s %s %s %d", code, name, room, d);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<kh> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            a.add(new kh(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort(new Comparator<kh>() {
            @Override
            public int compare(kh a, kh b){
                return (int)(b.d - a.d);
            }
        });
        a.forEach(e -> System.out.println(e));
    }
}
