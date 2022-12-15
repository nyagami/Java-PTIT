import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static String st(String s){
        if(s.length()==1) return "" + Character.toUpperCase(s.charAt(0));
        s = s.toLowerCase();
        return "" + Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String c = sc.next();
        if(a>0 && b>0) System.out.printf("%d %d %s",(a+b)*2, a*b, st(c));
        else System.out.println("INVALID");
    }
}
