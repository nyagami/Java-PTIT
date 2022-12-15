import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        long u1 = gcd(a,b), u2 = gcd(c,d);
        a/=u1; b/=u1; c/=u2; d/=u2;
        long m = b*d/gcd(b,d);
        long t = a*(m/b) + c*(m/d);
        long u = gcd(t,m);
        t/=u; m/=u;
        System.out.printf("%d/%d",t,m);
        sc.close();
    }
}
