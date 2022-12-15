import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            HashSet<Character> hs = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                hs.add(s.charAt(i));
            }
            if (s.length() >= 26 && hs.size() + k >= 26) {
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
