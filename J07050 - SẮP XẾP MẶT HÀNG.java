import java.util.*;
import java.io.*;

public class Main{
    
    static class goods implements Comparable<goods>{
        String code, name, type;
        float buy, sell, pro;

        public goods(int i, String n, String t, float x, float y){
            code = Integer.toString(i);
            while(code.length()<2) code = "0" + code;
            code = "MH" + code;
            name = n;
            type = t;
            buy = x;
            sell = y;
            pro = sell - buy;
        }

        @Override
        public int compareTo(goods o){
            return (int)(o.pro - pro);
        }

        public String toString(){
            return String.format("%s %s %s %.2f", code, name, type, pro);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<goods> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new goods(i+1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        Collections.sort(a);
        a.forEach(i -> System.out.println(i));
    }
}
