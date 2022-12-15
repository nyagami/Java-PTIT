import java.util.*;

public class non {
    static class Pair{
        int x, y, cnt;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
            this.cnt=0;
        }
        public Pair(String s){
            this.x = (int)(s.charAt(0) - 'a');
            this.y = (int)(s.charAt(1) - '1');
            this.cnt = 0;
        }
        
        public boolean is(Pair b){
            return x==b.x && y==b.y;
        }
    }
    
    static int[][] step = {{-2, 2}, {-1, 1}};

    static boolean check(int x, int y){
        return x>=0 && x<8 && y>=0 && y<8;
    }

    static void solve(String a, String b){
        Pair st = new Pair(a);
        Pair en = new Pair(b);
        boolean[][] check = new boolean[8][8];
        Queue<Pair> q = new LinkedList<>();
        q.add(st);
        while(!q.isEmpty()){
            Pair u = q.poll();
            if(u.is(en)){
                System.out.println(u.cnt);
                return;
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    for(int k=0;k<2;k++){
                        Pair x = new Pair(u.x+step[k][i], u.y+step[1-k][j]);
                        if(check(x.x, x.y)){
                            x.cnt = u.cnt+1;
                            q.add(x);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) solve(sc.next(), sc.next());
    }
}
