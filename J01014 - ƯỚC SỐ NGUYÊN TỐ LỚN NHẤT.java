
import java.util.Scanner;
public class Main {

    static long[] f = new long[2000001];
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long t = reader.nextLong();
        for (long i = 0; i < t; i++) {
            long ans=1;
            long a=reader.nextLong();
            for(long j=2;j<=(long)Math.sqrt(a);j++){
                if(a%j==0){
                    ans=j;
                    while(a%j==0){
                        a/=j;
                    }
                }
            }
            if(a>1) ans=a;
            System.out.println(ans);
        }
        reader.close();
    }
}
