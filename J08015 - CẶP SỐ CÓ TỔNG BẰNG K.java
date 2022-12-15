import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long k = sc.nextLong();
            HashMap<Long, Long> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                Long x = sc.nextLong();
                if (hm.get(x) == null)
                    hm.put(x, (long) 1);
                else
                    hm.put(x, hm.get(x) + 1);
            }
            long ans = 0;
            for (Map.Entry<Long, Long> set : hm.entrySet()) {
                long x = set.getKey();
                long y = set.getValue();
                if (x < (k + 1) / 2) {
                    if (hm.get(k - x) != null)
                        ans += y * hm.get(k - x);
                }
            }
            if (k % 2 == 0 && hm.get(k / 2) != null) {
                long x = hm.get(k / 2);
                ans += n * (n - 1) / 2;
            }
            System.out.println(ans);
        }
    }
}
