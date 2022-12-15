import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static char convert(char x){
        if("ABC".indexOf(x) > -1) return '2';
        if("DEF".indexOf(x) > -1) return '3';
        if("GHI".indexOf(x) > -1) return '4';
        if("JKL".indexOf(x) > -1) return '5';
        if("MNO".indexOf(x) > -1) return '6';
        if("PQRS".indexOf(x) > -1) return '7';
        if("TUV".indexOf(x) > -1) return '8';
        return '9';
    }
    static boolean dx(char[] a, int n){
        for(int i=0;i<=n/2;i++){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            s = s.toUpperCase();
            char[] c = new char[s.length()];
            for(int i=0; i<s.length(); i++){
                c[i] = convert(s.charAt(i));
            }
            if(dx(c, c.length)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
