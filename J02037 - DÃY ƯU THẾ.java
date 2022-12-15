import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            int cnt = 0;
            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) % 2 == 0)
                    cnt++;
            }
            if (s.length % 2 == 0 && cnt > s.length - cnt || s.length % 2 == 1 && s.length - cnt > cnt)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
