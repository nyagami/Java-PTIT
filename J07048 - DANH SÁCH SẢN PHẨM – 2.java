import java.util.*;
import java.io.*;

public class Main{
    
    static class goods implements Comparable<goods>{
        String code, name;
        int cost, time;
        public goods(String c, String n, int x, int y){
            code = c;
            name = n;
            cost = x;
            time = y;
        }

        @Override
        public int compareTo(goods o){
            if(cost == o.cost) return code.compareTo(o.code);
            return o.cost - cost;
        }

        public String toString(){
            return String.format("%s %s %d %d", code, name, cost, time);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<goods> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new goods(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        a.forEach(i -> System.out.println(i));
    }
}
