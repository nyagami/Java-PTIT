import java.io.*;
import java.util.*;

public class non {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        int cntn = 0;
        for(long i:a) if(i<0) cntn++;
        long sum = 0;
        if(k<=cntn){
            for(int i=0;i<k;i++) a[i] = -a[i];
        }else{
            for(int i=0;i<cntn;i++) a[i] = -a[i];
            Arrays.sort(a);
            k-=cntn;
            if(k%2==1) a[0] = -a[0];
        }
        for(long i:a) sum+=i;
        System.out.println(sum);
    }
}

