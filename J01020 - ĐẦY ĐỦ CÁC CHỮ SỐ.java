import java.util.*;

public class non {
    static long ans = (1<<10) - 1;

    static void solve(long n){
        if(n==0){
            System.out.println("Impossible");
            return;
        }
        long r = 0;
        for(long i=1;i<1000000;++i){
            long x=i*n;
            while(x>0){
                r|=(1<<(x%10));
                x/=10;
            }
            if(r==ans){
                System.out.println(i*n);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) solve(sc.nextLong());
    }
}
