import java.util.*;

public class non {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
            }
            long s = 0;
            for (int i = 0; i < n; i++) {
                s += x[i] * y[(i + 1) % n];
                s -= x[(i + 1) % n] * y[i];
            }
            System.out.printf("%.3f\n", Math.abs(s)*0.5);
        }
    }
}
