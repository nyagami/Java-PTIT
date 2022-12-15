import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        long[] f = new long[94];
        f[0]=0; f[1]=1;
        for(int i=2;i<=92;i++) f[i]=f[i-1]+f[i-2];

        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t>0){
            t--;
            long n = reader.nextLong();
            if(isfi(n,f)) System.out.println("YES");
            else System.out.println("NO");
        }
        reader.close();
    }
    static boolean isfi(long n,long[] f){
        for(int i=0;i<=92;i++){
            if(n==f[i]) return true;
        }
        return false;
    }
}
