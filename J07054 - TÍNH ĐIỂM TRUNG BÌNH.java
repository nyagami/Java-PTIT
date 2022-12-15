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
        String code, name;
        String tbc;
        int rank;
        public person(int i, String n, double a, double b, double c){
            code = String.format("SV%02d", i);
            name = stdName(n);
            tbc = String.format("%.2f", (a*3 + b*3 + c*2)/8);
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
                if(a.tbc.compareTo(b.tbc) == 0) return a.code.compareTo(b.code);
                return -a.tbc.compareTo(b.tbc);
            }
        });

        int rank = 1;
        for(int i=0; i<a.size(); i++){
            if(i>0 && a.get(i).tbc.compareTo(a.get(i-1).tbc) == 0){
                a.get(i).rank = a.get(i-1).rank;
                rank++;
            }else{
                a.get(i).rank = rank;
                rank++;
            }
            person x = a.get(i);
            System.out.println(x.code + ' ' + x.name + x.tbc + ' ' + x.rank);
        }
    }
}
