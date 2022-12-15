import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b,a.mod(b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a=sc.nextBigInteger(),b=sc.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
