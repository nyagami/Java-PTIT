import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<String> ans;

    static void Try(int end, int[] a, int sum, String s) {
        if (sum % 2 == 1) {
            System.out.println(s);
            ans.add(s);
        }
        for (int i = a.length - 1; i > end; i--) {
            Try(i, a, sum + a[i], s + a[i] + ' ');
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ans = new ArrayList<>();
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] < a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Try(-1, a, 0, "");
            Collections.sort(ans);
            // ans.forEach(e -> System.out.println(e));
        }
    }
}
