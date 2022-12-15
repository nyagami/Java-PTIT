import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static boolean inc(String s){
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true;
    }
    static boolean equal(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }
    static boolean se(String s){
        for(int i=0; i<s.length(); i++){
            if("68".indexOf(s.charAt(i)) == -1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String card = sc.next().substring(5);
            String[] a = card.split("['.']");
            card = a[0] + a[1];
            if(inc(card) || equal(card) || se(card)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
