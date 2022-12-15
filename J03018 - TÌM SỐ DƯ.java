import java.math.*;
import java.util.*;

public class Main {

    static int pow(int a, int b) {
        if (b == 0)
            return 1;
        return a * pow(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger n = new BigInteger(sc.next());
            int a = Integer.parseInt(n.mod(BigInteger.valueOf(4)).toString());
            int b = Integer.parseInt(n.mod(BigInteger.valueOf(2)).toString());
            int s = 1 + pow(2, a) + pow(3, a) + pow(4, b);
            System.out.println(s%5);
        }
    }
}
