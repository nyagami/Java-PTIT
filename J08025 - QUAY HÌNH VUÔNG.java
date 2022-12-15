import java.util.*;

public class non {

    static class pair{
        int[] a;
        int cnt;
        public pair(int[] a, int cnt){
            this.a = a;
            this.cnt = cnt;
        }
    }

    static int[] turn(int[] arr, int start){
        int[] a = new int[6];
        for(int i=0;i<6;i++) a[i]=arr[i];
        int x = a[start];
        a[start] = a[start+3];
        a[start+3] = a[start+4];
        a[start+4] = a[start+1];
        a[start+1] = x;
        return a;
    }

    static boolean check(int[] a, int[] b){
        for(int i=0;i<6;i++) if(a[i]!=b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int s[] = new int[6];
            int t[] = new int[6];
            for(int i=0;i<6;i++) s[i]=sc.nextInt();
            for(int i=0;i<6;i++) t[i]=sc.nextInt();
            Queue<pair> q = new LinkedList<>();
            q.add(new pair(s, 0));
            while(!q.isEmpty()){
                pair u = q.poll();
                if(check(t, u.a)){
                    System.out.println(u.cnt);
                    break;
                }
                q.add(new pair(turn(u.a, 0), u.cnt+1));
                q.add(new pair(turn(u.a, 1), u.cnt+1));
            }
        }
    }
}
