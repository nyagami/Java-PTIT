import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static boolean is(char x){
        if(x>='0' && x<='9') return true;
        return false;
    }
    static String check(String s){
        if(s.charAt(0)=='0') return "INVALID";
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(!is(s.charAt(i))) return "INVALID";
            if((s.charAt(i)-'0')%2==0) c++;
        }
        if(n%2==0 && c>n-c) return "YES";
        if(n%2==1 && c<n-c) return "YES";
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(check(sc.next()));
        }
        sc.close(); 
    }
}
