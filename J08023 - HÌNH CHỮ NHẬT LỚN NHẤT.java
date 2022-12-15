import java.util.*;

public class non {

    static void min(long[] a, int[] b, int start, int end, int step, int root){
        Stack<Integer> st = new Stack<>();
        for(int i=start;i!=end;i+=step){
            while(!st.isEmpty() && a[st.lastElement()] >= a[i]) st.pop();
            if(st.isEmpty()) b[i] = root;
            else b[i] = st.lastElement();
            st.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            int[] l = new int[n];
            int[] r = new int[n];
            min(a, l, 0, n, 1, -1);
            min(a, r, n-1, -1, -1, n);
            long ans = 0;
            for(int i=0;i<n;i++){
                ans = Math.max(ans, a[i]*(r[i]-l[i]-1));
            }
            System.out.println(ans);
        }
    }
}
