import java.util.*;
import java.io.*;
import java.text.*;

public class Main{

    static class phong{
        String c;
        double price, phi;
        public phong(String c,double price,double phi ){
            this.c = c;
            this.price = price;
            this.phi = phi;
        }
    }

    static class kh{
        phong o;
        String code, name, room;
        Long day;
        Double total, plus, fin; 
        public kh(phong o,int i, String name, String room, String d1, String d2){
            this.o = o;
            this.code = String.format("KH%02d",i);
            this.name = name;
            this.room = room;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try{
                this.day = (f.parse(d2).getTime() - f.parse(d1).getTime())/1000/3600/24;
            }catch(ParseException e){

            }
            this.total = o.price * this.day;
            if(this.day == 0) this.total = o.price; 
            if(this.day > 30) this.total*=0.94;
            else if(this.day >=20) this.total*=0.96;
            else if(this.day >=10) this.total*=0.98;
            this.plus = this.total * this.o.phi;
            this.fin = this.total + this.plus;
        }

        @Override
        public String toString(){
            return code + " " + name + " " + room + " " + day + " " + String.format("%.2f", fin);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        // Scanner sc = new Scanner(System.in);
        HashMap<String, phong> hm = new HashMap<>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            String c = sc.next();
            sc.next();
            phong x = new phong(c, sc.nextDouble(), sc.nextDouble());
            hm.put(c, x);
        }
        int m = sc.nextInt();
        ArrayList<kh> a = new ArrayList<>();
        for(int i=0;i<m;i++){
            sc.nextLine();
            String name = sc.nextLine();
            String code = sc.next();
            String c = code.substring(2,3);
            a.add(new kh(hm.get(c), i+1, name, code, sc.next(), sc.next()));
        }
        a.sort((kh x, kh y) -> y.day.compareTo(x.day));
        a.forEach(e -> System.out.println(e));
    }
}
