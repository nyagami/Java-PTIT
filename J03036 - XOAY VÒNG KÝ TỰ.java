import java.util.*;

public class non {

    static int turn(String a, String b){
        if(a.length() != b.length()) return -1;
        String s = a;
        for(int i=0;i<=a.length();i++){
            if(s.compareTo(b) == 0) return i;
            s = s.substring(1) + s.charAt(0);
        }
        return -1;
    }

    static void solve(String[] a){
        int ans = 1000000;
        for(String i: a){
            int cnt = 0;
            for(String j:a){   
                int x = turn(j, i);
                if(x==-1){
                    System.out.println(-1);
                    return;
                }
                cnt+=x;
            }
            ans=Math.min(ans, cnt);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=0;i<a.length;i++) a[i] = sc.next();
        solve(a);
    }
}
