import java.io.*;
import java.util.*;

public class Main {
    
    static long pow(long a, long b){
        if(b==0) return 1;
        return pow(a, b-1) * a;
    }

    static long q_cnt(String a){
        long r=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == '?') r++;
        }
        return r;
    }

    static long cnt(int i, String a, String b, long rm){
        if(i==a.length()) return 0;
        if(a.charAt(i)=='?'){
            return (long)('9' - b.charAt(i))*pow(10, rm - 1) + cnt(i+1, a, b, rm - 1);
        }
        else{
            if(a.charAt(i) < b.charAt(i)) return 0;
            if(a.charAt(i) > b.charAt(i)) return pow(10, rm);
            return cnt(i+1, a, b, rm);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.next(), b = sc.next();
            long n = q_cnt(a);
            if(a.length()<b.length() || n==0) System.out.println(0);
            else if(a.length() > b.length()){
                if(a.charAt(0) == '?') System.out.println(9*pow(10, n-1));
                else System.out.println(pow(10, n));
            }else{
                System.out.println(cnt(0,a,b,n));
            }
        }
    }
}
