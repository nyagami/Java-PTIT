import java.util.*;

public class Main {
    static class pair {
        int x, y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<pair> a = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0;
            pair x = new pair();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    if (i == 0) {
                        x.x = j;
                        i++;
                    } else
                        x.y = j;
                }
            }
            a.add(x);
        }
        int cnt = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).y < a.get(j).x || a.get(j).y < a.get(i).x || (a.get(i).x-a.get(j).x) * (a.get(j).y -a.get(i).y) > 0)
                    continue;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
