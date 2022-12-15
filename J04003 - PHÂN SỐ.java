import java.util.Scanner;

public class Main{
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long g = gcd(a,b);
        a/=g; b/=g;
        System.out.printf("%d/%d",a,b);
        sc.close();
    }
}
