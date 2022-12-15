import java.util.Scanner;

public class Main {
    static String check(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char x=s.charAt(i),y=s.charAt(n-i-1);
            if(x!=y) return "NO";
            if((x-'0')%2==1) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(check(s));
        }
        sc.close();
    }
}
