import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            if (a.mod(new BigInteger("11")).equals(BigInteger.ZERO))
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
