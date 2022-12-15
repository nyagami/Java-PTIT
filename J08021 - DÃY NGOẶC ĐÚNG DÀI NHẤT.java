import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int dp[] = new int[s.length()];
            int ans = 0;
            Stack<Integer> a = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(a.empty()) a.push(i);
                else{
                    if(s.charAt(i) == ')' && s.charAt(a.lastElement()) == '('){
                        dp[i] = i - a.lastElement() + 1;
                        if(a.lastElement() > 0 && s.charAt(a.lastElement() - 1) == ')'){
                            dp[i] += dp[a.lastElement() - 1];
                        }
                        ans = Math.max(ans, dp[i]);
                        a.pop();
                    }else a.push(i);
                }
            }
            System.out.println(ans);
        }
    }
}
