import java.util.Scanner;

public class Main {
    static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long s=1;
            for(int i=1;i<=n;i++){
                s=lcm(s,i);
            }
            System.out.println(s);
        }
        sc.close();
    }
}
