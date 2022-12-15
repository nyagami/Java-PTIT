import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b, a.mod(b));
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.multiply(b).divide(gcd(a,b)));
        }
        sc.close();
    }
}
