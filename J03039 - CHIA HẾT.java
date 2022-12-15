import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
