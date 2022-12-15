import java.util.*;

public class non {
    static class pair{
        int x, y;
        public pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int solve(int s, int t){
        if(s>=t) return s - t;
        if(t%2==1) return 1 + solve(s, t+1);
        return 1 + solve(s, t>>1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) System.out.println(solve(sc.nextInt(), sc.nextInt()));
    }
}
