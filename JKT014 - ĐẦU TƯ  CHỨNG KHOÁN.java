import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int[] fb = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (st.empty()) {
                    fb[i] = - 1;
                    st.push(i);
                } else {
                    while (!st.empty() && a[st.lastElement()] <= a[i])
                        st.pop();
                    if (st.empty())
                        fb[i] = - 1;
                    else
                        fb[i] = st.lastElement();
                    st.push(i);
                }
            }
            for (int i = 0; i < n; i++)
                System.out.printf("%d ", i-fb[i]);
            System.out.println();
        }
    }
}
