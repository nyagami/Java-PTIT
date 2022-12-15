import java.util.*;
import java.util.zip.DataFormatException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main{
    static String stdName(String s){
        String[] n = s.toLowerCase().split("[' ']+");
        String r = "";
        for(int i=0; i<n.length; i++){
            if(n[i].length() == 0) continue;
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }
    static int getPrice(int room){
        int x = room/100;
        if(x==1) return 25;
        if(x==2) return 34;
        if(x==3) return 50;
        return 80;
    }
    static String fomartDay(String s){
        String[] a = s.split("/");
        return (a[0].length() == 1 ? "0" + a[0] : a[0]) + '/' + (a[1].length() == 1 ? "0" + a[1] : a[1]) + '/' + a[2];
    }
    static class cus{
        String code, name;
        int room, days, bill;
        public cus(int i, String n, int r, String a, String l, int ex){
            code = String.format("KH%02d", i);
            name = stdName(n);
            room = r;
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            try{
                days = (int)((d.parse(l).getTime() - d.parse(a).getTime())/(24*60*60*1000) + 1);
            } catch(ParseException e){

            }
            bill = getPrice(room)*days + ex;
        }

        @Override
        public String toString(){
            return code + ' ' + name + room + ' ' + days + ' ' + bill;
        }
    }
    public static void main(String[] arg)throws IOException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<cus> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            a.add(new cus(i, sc.nextLine(), sc.nextInt(), fomartDay(sc.next()), fomartDay(sc.next()), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<cus>() {
            @Override
            public int compare(cus a, cus b){
                return b.bill - a.bill;
            }
        });
        a.forEach(e -> System.out.println(e));
    }
}
