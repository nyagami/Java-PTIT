
import java.util.Scanner;
public class Main {

    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        for (int i = 0; i < t; i++) {
            int a=reader.nextInt(), b=reader.nextInt();
            System.out.printf("%d %d\n",lcm(a,b),gcd(a,b));
        }
        reader.close();
    }
}
