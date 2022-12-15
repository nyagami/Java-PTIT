import java.util.*;
import java.io.*;

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
    static class person{
        String code, name, type, TBC;
        double tbc;
        public person(int i, String n, double a, double b, double c){
            code = String.format("SV%02d", i);
            name = stdName(n);
            tbc = (a*0.25 + b*0.35 + c*0.4);
            if(tbc>=8) type = "GIOI";
            else if(tbc>=6.5) type = "KHA";
            else if(tbc>=5) type = "TRUNG BINH";
            else type = "KEM";
            TBC = String.format("%.2f", tbc);
        }

        @Override
        public String toString(){
            return code + ' ' + name + TBC + ' ' + type;
        }
    }
    public static void main(String[] arg)throws IOException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList<person> a = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            a.add(new person(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a, new Comparator<person>() {
            @Override
            public int compare(person a, person b){
                int c = a.TBC.compareTo(b.TBC);
                if(c==0) return a.code.compareTo(b.code);
                return -c;
            }
        });
        a.forEach(e -> System.out.println(e));
    }
}
