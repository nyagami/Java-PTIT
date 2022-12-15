import java.util.*;
public class non {

    static int value(String s){
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            cnt += (int)(s.charAt(i)-'A');
        }
        return cnt;
    }

    static String turn(String s){
        int value = value(s);
        String r = "";
        for(int i=0;i<s.length();i++){
            r += (char)((s.charAt(i) - 'A' + value)%26 + 'A');
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String a = s.substring(0, s.length()/2);
            String b = s.substring(s.length()/2);
            a = turn(a);
            b = turn(b);
            String r = "";
            for(int i=0;i<a.length();i++){
                r += (char)((a.charAt(i) + b.charAt(i) - 2*'A')%26 + 'A');
            }
            System.out.println(r);
        }
    }
}
