
import java.util.Scanner;
public class Main {

    static String check(String s){
        int sum=s.charAt(0)-'0';
        for(int i=1;i<s.length();i++){
            sum+=s.charAt(i)-'0';
            int x=s.charAt(i)-s.charAt(i-1);
            if(x!=2 && x!=-2) return "NO";
        }
        if(sum%10!=0) return "NO";
        return "YES";
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            System.out.println(check(s));
        }
        sc.close();
    }
}
