import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String S = sc.next();
            int cnt = 0;
            for(int i=0; i<S.length()/2; i++){
                if(S.charAt(i) != S.charAt(S.length()-i-1)) cnt++;
            }
            if(cnt==1 || cnt==0 && S.length() % 2 == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
