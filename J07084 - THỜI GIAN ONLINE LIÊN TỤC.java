import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    static class ob{
        String full, start, end;
        long total;
        public ob(String n, String s, String e){
            full = n;
            start = s;
            end = e;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
            try{
                total = f.parse(end).getTime() - f.parse(start).getTime();
            }catch(ParseException ex){

            }
        }

        @Override
        public String toString(){
            return full + ' ' + total/60000;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++) a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        a.sort((ob x, ob y) -> {
            if(x.total == y.total) return x.full.compareTo(y.full);
            return y.total > x.total ? 1 : -1;
        });
        a.forEach(e -> System.out.println(e));
    }
}
