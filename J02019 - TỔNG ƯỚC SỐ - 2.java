
import java.util.Scanner;
public class non {

    static int N = 1000000;
    static int[] U = new int[N+2];
    static int pow(int a, int b){
        if(b==0) return 1;
        if(b%2==1) return pow(a,b-1)*a;
        int p = pow(a, b>>1);
        return p*p;
    }
    static void set(){
        for(int i=2;i<=(int)Math.sqrt(N);++i){
            if(U[i]==0){
                U[i]=i;
                for(int j=0;j<=N/i;++j) U[i*j] = i;
            }
        }
        for(int i=2;i<=N;++i){
            if(U[i]==0) U[i]=i+1;
            else{
                int n = i, x = 0;
                while(n%U[i]==0){
                    n/=U[i];
                    x++;
                }
                if(n==1) U[i] = (pow(U[i], x+1) - 1)/(U[i]-1);
                else U[i] = U[pow(U[i], x)] * U[n];
            }
        }
    }
    public static void main(String[] args) {
        set();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;
        for(int i=a;i<=b;++i) if(U[i] - i > i) ++cnt;
        System.out.println(cnt);
    }
}
