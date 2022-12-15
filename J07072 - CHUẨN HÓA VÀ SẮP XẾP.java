import java.util.*;
import java.io.*;

/**
 *
 * @author GIGABYTE
 */
public class Main {
    static class ob{
        String full, first, last, mid;
        public ob(String name){
            full = "";
            String[] a = name.trim().split("\\s+");
            for(int i=0;i<a.length;i++){
                a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
                full+=a[i] + ' ';
            }
            first = a[0];
            last = a[a.length -1];
            mid="";
            for(int i=1;i<a.length-1;i++) mid +=a[i];
        };
        
        @Override
        public String toString(){
            return full;
        }
        
    }
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(new File("DANHSACH.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<ob> a = new ArrayList<>();
        while(sc.hasNextLine()){
            a.add(new ob(sc.nextLine().toLowerCase()));
        }
       a.sort((ob x, ob y) -> {
           if(x.last.compareTo(y.last) == 0){
               if(x.first.compareTo(y.first)==0) return x.mid.compareTo(y.mid);
               return x.first.compareTo(y.first);
           }
           return x.last.compareTo(y.last);    
       });
       a.forEach(e->System.out.println(e));
    }
    
}
