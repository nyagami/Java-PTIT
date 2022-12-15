import java.util.*;
import java.io.*;;

public class Main{
    public static void main(String[] arg)throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s;
            s = sc.next();
            try{
                int t = Integer.parseInt(s);
            }catch(NumberFormatException e){
                a.add(s);
            }
        }
        a.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });
        a.forEach(s -> System.out.print(s+" "));
    }
}
