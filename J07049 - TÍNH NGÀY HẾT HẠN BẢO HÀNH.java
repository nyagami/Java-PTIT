import java.util.*;
import java.io.*;
import java.text.*;
public class Main {

    static String outdate(String s, long time){
        String[] a = s.split("/");
        Long m = Long.parseLong(a[1]);
        Long y = Long.parseLong(a[2]);
        m += time;
        y += m/12;
        m%=12;
        if(m==0){
            m=(long)12;
            y--;
        }
        return String.format("%s/%02d/%04d", a[0], m, y);
    }

    static class sp{
        String code, name;
        Long price, time;
        public sp(String code, String name, long price, long time){
            this.code = code;
            this.name = name;
            this.price = price;
            this.time = time;
        }
    }

    static class kh{
        sp o;
        String code, name, address, date, outdate;
        Long sl, total;
        Date time;
        public kh(int i, String name, String address, sp o, long sl, String date){
            this.o = o;
            this.code = String.format("KH%02d", i);
            this.name = name;
            this.address = address;
            this.sl = sl;
            this.date = date;
            this.outdate = outdate(date, o.time);
            this.total = sl * o.price;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try{
                this.time = f.parse(this.outdate);
            }catch(ParseException e){

            }
        }

        @Override
        public String toString(){
            return code + " " + name + " "  + address + " " + o.code + " " + total + " " + outdate;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        // Scanner sc = new Scanner(System.in);
        HashMap<String, sp> hm = new HashMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            sp x = new sp(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            hm.put(x.code, x);
        }
        int m = sc.nextInt();
        ArrayList<kh> a = new ArrayList<>();
        for(int i=1;i<=m;i++){
            sc.nextLine();
            a.add(new kh(i, sc.nextLine(), sc.nextLine(), hm.get(sc.next()), sc.nextInt(), sc.next()));
        }
        a.sort((kh x, kh y) -> x.time.compareTo(y.time));
        a.forEach(e -> System.out.println(e));
    }
}
